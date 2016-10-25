package com.bicjo.lite.core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionManagerUtilTest extends Assert {

	private final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS 'Users' ('id'    TEXT,'name' TEXT,'passion'  TEXT,PRIMARY KEY(id));";
	private final String DROP_TABLE_SQL = "DROP TABLE IF EXISTS Users";
	private final String INSERT_SQL = "INSERT INTO Users VALUES('1','rose','chasing chance')";
	private final String SELECT_SQL = "SELECT * FROM Users";

	@Test
	public void getConnection() {
		try {

			Connection connection = ConnectionManagerUtil.getConnection();
			assertNotNull(connection);
			assertFalse(connection.isClosed());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createTable() {

		Connection connection = null;
		Statement statement = null;
		try {

			connection = ConnectionManagerUtil.getConnection();
			statement = connection.createStatement();

			statement.executeUpdate(CREATE_TABLE_SQL);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManagerUtil.close(connection, statement);
		}

	}

	@Test
	public void insert() {

		Connection connection = null;
		Statement statement = null;
		try {

			connection = ConnectionManagerUtil.getConnection();
			statement = connection.createStatement();

			statement.executeUpdate(INSERT_SQL);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManagerUtil.close(connection, statement);
		}
	}

	@Test
	public void select() {

		Connection connection = null;
		Statement statement = null;
		try {

			connection = ConnectionManagerUtil.getConnection();
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(SELECT_SQL);
			while (resultSet.next()) {
				String s = String.format("ID:%s Username:%s Passion:%s", resultSet.getString("id"),
						resultSet.getString("name"), resultSet.getString("passion"));
				System.out.println(s);
				System.out.println();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManagerUtil.close(connection, statement);
		}
	}

	@Test
	public void dropTable() {

		Connection connection = null;
		Statement statement = null;
		try {

			connection = ConnectionManagerUtil.getConnection();
			statement = connection.createStatement();

			statement.executeUpdate(DROP_TABLE_SQL);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManagerUtil.close(connection, statement);
		}

	}

}
