package me.rerere.litesql;

import me.rerere.litesql.connection.ConnectionProvider;
import me.rerere.litesql.connection.DatabaseType;

public class LiteSQL {
    private ConnectionProvider connectionProvider; // Connection Provider,provide sql connections to LiteSQL
    private DatabaseType databaseType; // DataBase Type (MySQL or SQLite)
}
