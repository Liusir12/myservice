package jdbc01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
//ͨ��Ա����š�7788���޸�Ա���Ĺ���Ϊ3000��������test��

public class jdbc_2 {

	private static CallableStatement prepareCall;
	private static PreparedStatement pstmt;
	private static int executeUpdate;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
			String sql="update emp set sal=3000 and ename='test' where empno=?";
		 pstmt =conn.prepareStatement(sql);
		 pstmt.setInt(1, '?');
		 int num = pstmt.executeUpdate();
		 if(num!=0) {
			 System.out.println("�޸ĳɹ�");
		 }else {
			 System.out.println("�޸�ʧ��");
		 }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
		//	Statement pstmt = null;
		//	pstmt.close();
//			Statement conn = null;
//			conn.close();
		}
		

	}

}
