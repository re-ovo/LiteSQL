package me.rerere.litesql;

import me.rerere.litesql.connection.ConnectionProvider;
import me.rerere.litesql.connection.DatabaseType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LiteSQL {
    // Data to be provided when instantiating
    private String name; // You should give me a name
    private ConnectionProvider connectionProvider; // Connection Provider,provide sql connections to LiteSQL
    private DatabaseType databaseType; // DataBase Type (MySQL or SQLite)

    // Data not required
    private Logger logger = LogManager.getLogger("LiteSQL");// you can change this logger by LiteSQL#setLogger method

    public String getName() {
        return name;
    }

    public ConnectionProvider getConnectionProvider() {
        return connectionProvider;
    }

    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    public Logger getLogger() {
        return logger;
    }
}
