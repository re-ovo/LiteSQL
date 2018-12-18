package me.rerere.litesql.connection;

import java.sql.Connection;

public interface ConnectionProvider {
    Connection getConnection();
}
