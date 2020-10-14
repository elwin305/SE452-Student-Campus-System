package edu.depaul.cdm.demo.student.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

public class ConnectJDBC {

    Connection conn = null;
    Statement stmt = null;

    public ConnectJDBC() {
        try {
            String url = "jdbc:mysql://localhost:3306/se452";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("\nConnected to the database se452\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }


    public void getCoursesData() {

        try {
                stmt = conn.createStatement();
                String sql = "SELECT * FROM courses";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){

                    int COURSE_ID   = rs.getInt("COURSE_ID");
                    String SHORT_NAME  = rs.getString("SHORT_NAME");
                    String NAME  = rs.getString("NAME");
                    String DEPARTMENT   = rs.getString("DEPARTMENT");
                    int CREDITS  = rs.getInt("CREDITS");
                    byte GRADUATE = rs.getByte("GRADUATE");


                    System.out.print("COURSE_ID : " + COURSE_ID );
                    System.out.print(", CREDITS : " + CREDITS );
                    System.out.print(", SHORT_NAME : " + SHORT_NAME );
                    System.out.print(", NAME : " + NAME );
                    System.out.print(", DEPARTMENT  : " + DEPARTMENT  );
                    System.out.println(", GRADUATE : " + GRADUATE + "\n");

                }

                rs.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
