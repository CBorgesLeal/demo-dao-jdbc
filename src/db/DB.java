package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	/**
	 * Faz a leitura do arquivo de propriedades db.properties que cont�m
	 * as propriedades do banco de dados
	 * @return objeto do tipo Properties
	 */
	private static Properties loadProperties() {

		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DBException(e.getMessage());
		}
	}

	/**
	 * Executa a conex�o com o banco de dados
	 * @return objeto do tipo Connection 
	 */
	public static Connection getConnection() {

		try {
			if (conn == null) {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			}
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		}

		return conn;
	}
	
	/**
	 * Fecha o statement
	 */
	public static void closeStatement(Statement st) {
				
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		
	}
	
	public static void closeResultSet(ResultSet rs) {
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		
	}

	
	public static void closeConnection(Connection conn) {
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		
	}
}
