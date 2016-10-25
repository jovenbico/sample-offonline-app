package com.bicjo.lite.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class ConnectionManagerUtil {

	private static BasicDataSource basicDataSource;

	static {

		try {

			Properties prop = new Properties();
			prop.put("driverClassName", "org.sqlite.JDBC");
			prop.put("url", "jdbc:sqlite:my-data.db");
			// prop.put("username", "");
			// prop.put("password", "");

			basicDataSource = BasicDataSourceFactory.createDataSource(prop);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection connection = null;
		try {

			connection = basicDataSource.getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}

	public static void close(Connection connection, Statement statement) {
		try {

			if (statement != null && !statement.isClosed()) {
				statement.close();
			}

			if (connection != null && !connection.isClosed()) {
				connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
