package com.moh.DBConnection;

import static JDBC.Jdbc.con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseMoh {

    private final String driveName = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/mohmanagementsystem";
    private final String userName = "root";
    private final String password = "";
    //private Connection con = null;

    public Connection con() throws Exception {

        Class.forName(driveName);
        Connection con = DriverManager.getConnection(url, userName, password);
        return con;

    }

    public ResultSet getData(String sql) throws Exception {
        Statement st = con().createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public void putData(String sql) throws Exception {
        Statement st = con().createStatement();
        st.executeUpdate(sql);

    }

    public ResultSet getCount(String sql) throws Exception {
        Statement st = con().createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;

    }

}
