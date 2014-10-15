package action;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *Á´½ÓÊý¾Ý¿â
 * @author Regin
 *
 */
public class ConnDao {
		//public static final String DBDRIVER  ;
		public static final String DBURL = "jdbc:mysql://localhost:3306/bookdb";
		public static final String DBUSER = "root" ;
		public static final String DBPASS = "950210" ;
		public Connection getConn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");                
		Connection conn=null; 
		conn=DriverManager.getConnection(DBURL, DBUSER, DBPASS);   
		return conn;
	}
}