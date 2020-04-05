package com.company;
import java.util.*;

public interface DB {
    // Database info
    String dbName= "TODO";
    String TableName= "TODO_List";



    // JDBC driver name and database URL
    String jdbc_driver= "com.mysql.cj.jdbc.Driver";
    String db_url= "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=" + TimeZone.getDefault().getID();

    //  Database credentials
    String user= "root";
    String pass= "";



    //getters
    String getJdbc_driver();
    String getDb_url();
    String getUser();
    String getPass();
    String getDbName();
    String getTableName();



}