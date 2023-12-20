
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class check
{
    public static void main(String[] arg)
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter name");
        name=sc.next();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/c6008", "root","1234");
            PreparedStatement ps = con.prepareStatement("insert into Student values('"+name+"')");
            if(1==ps.executeUpdate())
            {
                System.out.println("Success");
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        sc.close();
    }
}