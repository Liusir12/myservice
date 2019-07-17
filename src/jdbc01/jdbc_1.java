package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class jdbc_1 {

	private static Connection connection;
	private static Statement stmt;
	private static ResultSet executeQuery;
	private static int  int1;
	private static String string;
	private static String string2;

	public static void main(String[] args) throws SQLException {
//		//加载驱动
//		DriverManager.deregisterDriver(new Driver());
//		//创建连接对象
//		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1904", "root", "123456");
//		System.out.println(connection);
//		//
//		String sql="select * from student";
//		stmt = connection.createStatement();
//		//执行
//		 ResultSet rs = stmt.executeQuery(sql);  //查调取的
//		while( rs.next()) {
//			int int1 = rs.getInt("sid"); //建议写列明，不写索引
//			string = rs.getString("sname");
//			//string2 = rs.getString("pwd");
//			System.out.println("学号:"+int1+"，姓名:"+string+"");
//			
//			//登录功能
//			
//			
//			
//			
//			
//		}
//	
//		//stmt.executeUpdate(sql) //增删改
		
		 //登录功能
		
		 
		 
	}

}
