package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

//2)	向数据库插入三条book的数据

public class homeWork {
	public static void sel2Book() {
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 
		 try {
			 //加载驱动 的两种方法 。
			 DriverManager.registerDriver(new Driver());  	 //方式一：
			 Class.forName("com.mysql.jdbc.Driver");        //方式二
		//连接数据库
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//创建执行sql语句的对象 并添加一条需要执行的sql语句并赋值
		String sql="select * from book where bname like '三%'";
		pstmt =conn.prepareStatement(sql);
			
			//处理返回的结果
			 rs=pstmt.executeQuery();
			 while(rs.next()) {
				 int bid=rs.getInt("bid");
				 String bname=rs.getString("bname");
				 String author=rs.getString("author");
				 double price=rs.getDouble("price");
				System.out.println("书号："+bid+",书名："+bname+",作者1："+author+",价格："+price);
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
			 //加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接数据库
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//创建执行sql语句的对象 并添加一条需要执行的sql语句并赋值
		String sql="select * from book";
		pstmt =conn.prepareStatement(sql);
			
			//处理返回的结果
			 rs=pstmt.executeQuery();
			 while(rs.next()) {
				 int bid=rs.getInt("bid");
				 String bname=rs.getString("bname");
				 String author=rs.getString("author");
				 double price=rs.getDouble("price");
				System.out.println("书号："+bid+",书名："+bname+",作者："+author+",价格："+price);
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
			 //加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接数据库
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//创建执行sql语句的对象 并添加一条需要执行的sql语句并赋值
		String sql="delete from book where bid=?";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			//处理返回的结果
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
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
			 //加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接数据库
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//创建执行sql语句的对象 并添加一条需要执行的sql语句并赋值
		String sql="update book set price=50 where bid=?";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			
			//处理返回的结果
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("修改成功");
			}else {
				System.out.println("修改失败");
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
			 //加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接数据库
		conn = DriverManager.getConnection("jdbc:mysql:///db1904", "root", "123456");
		//创建执行sql语句的对象 并添加一条需要执行的sql语句并赋值
		String sql="insert into book values(?,?,?,?)";
		pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, book.getBid());
			pstmt.setString(2, book.getBname());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			//处理返回的结果
			int num =pstmt.executeUpdate();
			if(num!=0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
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
//		Book book=new Book(1,"三国演义","罗贯中",20.5);
//		Book book1=new Book(2,"西游记","吴承恩",20);
//		Book book2=new Book(3,"水浒传","施耐庵",30);
//		addBook(book);
//		addBook(book1);
//		addBook(book2);
		
	//	alterBook(3);
	//	delBook(2);
		//selBook();
		sel2Book();

	}
}
