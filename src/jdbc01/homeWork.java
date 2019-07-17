package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

//2)	�����ݿ��������book������

public class homeWork {
	public static void sel2Book() {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 
		 try {
			 //�������� �����ַ��� ��
			 DriverManager.registerDriver(new Driver());  	 //��ʽһ��
			 Class.forName("com.mysql.jdbc.Driver");        //��ʽ��
		//�������ݿ�
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//����ִ��sql���Ķ��� �����һ����Ҫִ�е�sql��䲢��ֵ
		String sql="select * from book where bname like '��%'";
		pstmt =conn.prepareStatement(sql);
			
			//�����صĽ��
			 rs=pstmt.executeQuery();
			 while(rs.next()) {
				 int bid=rs.getInt("bid");
				 String bname=rs.getString("bname");
				 String author=rs.getString("author");
				 double price=rs.getDouble("price");
				System.out.println("��ţ�"+bid+",������"+bname+",���ߣ�"+author+",�۸�"+price);
			 }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
					}
				if(pstmt!=null) {
				pstmt.close();
				}
				if(pstmt!=null) {
				conn.close();
				}
			} catch (Exception e2) {
			}
		}
		 
	}
	
	
	
	public static void selBook() {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 
		 try {
			 //��������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ�
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//����ִ��sql���Ķ��� �����һ����Ҫִ�е�sql��䲢��ֵ
		String sql="select * from book";
		pstmt =conn.prepareStatement(sql);
			
			//�����صĽ��
			 rs=pstmt.executeQuery();
			 while(rs.next()) {
				 int bid=rs.getInt("bid");
				 String bname=rs.getString("bname");
				 String author=rs.getString("author");
				 double price=rs.getDouble("price");
				System.out.println("��ţ�"+bid+",������"+bname+",���ߣ�"+author+",�۸�"+price);
			 }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
					}
				if(pstmt!=null) {
				pstmt.close();
				}
				if(pstmt!=null) {
				conn.close();
				}
			} catch (Exception e2) {
			}
		}
		 
	}
	
	public static void delBook(int bid) {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 
		 try {
			 //��������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ�
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//����ִ��sql���Ķ��� �����һ����Ҫִ�е�sql��䲢��ֵ
		String sql="delete from book where bid=?";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			//�����صĽ��
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("ɾ���ɹ�");
			}else {
				System.out.println("ɾ��ʧ��");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
				pstmt.close();
				}
				if(pstmt!=null) {
				conn.close();
				}
			} catch (Exception e2) {
			}
		}
		 
	}
	
	
	public static void alterBook(int bid) {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 
		 try {
			 //��������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ�
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//����ִ��sql���Ķ��� �����һ����Ҫִ�е�sql��䲢��ֵ
		String sql="update book set price=50 where bid=?";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			//�����صĽ��
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("�޸ĳɹ�");
			}else {
				System.out.println("�޸�ʧ��");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
				pstmt.close();
				}
				if(pstmt!=null) {
				conn.close();
				}
			} catch (Exception e2) {
			}
		}
		 
	}
	
	public static void addBook(Book book) {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 
		 try {
			 //��������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ�
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//����ִ��sql���Ķ��� �����һ����Ҫִ�е�sql��䲢��ֵ
		String sql="insert into book values(?,?,?,?)";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, book.getBid());
			pstmt.setString(2, book.getBname());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			//�����صĽ��
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
				pstmt.close();
				}
				if(pstmt!=null) {
				conn.close();
				}
			} catch (Exception e2) {
			}
		}
		 
		 
	 }	
	
	public static void main(String[] args) {
//		Book book=new Book(1,"��������","�޹���",20.5);
//		Book book1=new Book(2,"���μ�","��ж�",20);
//		Book book2=new Book(3,"ˮ䰴�","ʩ����",30);
//		addBook(book);
//		addBook(book1);
//		addBook(book2);
		
	//	alterBook(3);
	//	delBook(2);
		//selBook();
		sel2Book();

	}
}
