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
//		//��������
//		DriverManager.deregisterDriver(new Driver());
//		//�������Ӷ���
//		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1904", "root", "123456");
//		System.out.println(connection);
//		//
//		String sql="select * from student";
//		stmt = connection.createStatement();
//		//ִ��
//		 ResultSet rs = stmt.executeQuery(sql);  //���ȡ��
//		while( rs.next()) {
//			int int1 = rs.getInt("sid"); //����д��������д����
//			string = rs.getString("sname");
//			//string2 = rs.getString("pwd");
//			System.out.println("ѧ��:"+int1+"������:"+string+"");
//			
//			//��¼����
//			
//			
//			
//			
//			
//		}
//	
//		//stmt.executeUpdate(sql) //��ɾ��
		
		 //��¼����
		
		 
		 
	}

}
