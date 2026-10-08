package level3;

import java.sql.*;
import java.util.Scanner;

public class Database2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Accepted");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/chettinad",
                "root",
                "Localhost@123"
            );

            System.out.println("Connection success");

            Statement st = con.createStatement();

            System.out.print("Enter roll number: ");
            int rno = scan.nextInt();
            scan.nextLine(); // consume newline

            System.out.print("Enter student name: ");
            String sname = scan.nextLine();

            System.out.print("Enter mark: ");
            float mark = scan.nextFloat();

            int result = st.executeUpdate(
                "insert into student values(" + rno + ",'" + sname + "'," + mark + ")"
            );

            if (result > 0) {
                System.out.println("Successfully inserted");
            }
            else {
                System.out.println("No records inserted");
            }

            st.close();
            con.close();
            scan.close();
        }
        catch (Exception e) {
            System.out.println("Error Reason: " + e);
        }
    }
}