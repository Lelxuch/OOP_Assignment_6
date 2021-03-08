package Singleton;

import java.sql.*;

public class Database {

    private static Database database;

    private Database() {}

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public void query() {
        //
    }
}
