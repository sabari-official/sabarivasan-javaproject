package level3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Database3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Accepted");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/chettinad",
                    "root",
                    "Localhost@123");

            System.out.println("Connection success");
            Statement st = con.createStatement();

            System.out.print("Enter roll number to delete: ");
            int rno = scan.nextInt();
            int result = st.executeUpdate("delete from student where regno = " + rno);
            if (result > 0)
                System.out.println("Successfully deleted from db");
            else
                System.out.println("No records found in db");
            st.close();
            con.close();
            scan.close();
        } catch (Exception e) {
            System.out.println("Error Reason: " + e);
        }

    }
}