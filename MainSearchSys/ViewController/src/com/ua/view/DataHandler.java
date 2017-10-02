package com.ua.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import oracle.jdbc.pool.OracleDataSource;


public class DataHandler {


    public DataHandler() {
        super();
    }


    String jdbcUrl = null;
    String userid = null;
    String password = null;
    Connection conn;

    public void getDBConnection() throws SQLException {
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn = ds.getConnection(userid, password);

    }

    public Employee findEmployeeById(int id) throws SQLException {
        Employee selectedEmp = new Employee();
        getDBConnection();

        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM Employees WHERE employee_id = " + id;
        System.out.println("\nExecuting: " + query);
        return null;
    }
}
