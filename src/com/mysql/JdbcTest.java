package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//导入的时候要注意

//import com.java.jdbc.Connection;
//import com.java.jdbc.Statement;

public class JdbcTest {
	//JDBC驱动器名称和数据库地址
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//数据库的名字为test
	static final String DB_URL = "jdbc:mysql://localhost/test?useSSL=false";
	//数据库用户和密码
	static final String USER = "root";
	static final String PASS="root";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try{
			//注册JDBC驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//打开连接
			System.out.println("Connecting to database");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Creating statement");
			//创建所需的ResultSet,双向，只读
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
			String sql;
			sql = "SELECT name,id FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			//将光标移到最后一行
			System.out.println("Moving cursor to the last...");
		    rs.last();
		    //处理结果集
		    System.out.println("Displaying record ...");
		    String name = rs.getString("name");
		    int id = rs.getInt("id");
		    //显示：
		    System.out.println("Name:" + name);
		    System.out.println("ID:"+ id);
		    System.out.println();
		    //将光标移到第一行
		    System.out.println("Moving cursor to the first row...");
		    rs.first();
		    //处理结果集
		    System.out.println("Displaying record ...");
		    name = rs.getString("name");
		    id = rs.getInt("id");
		    //显示：
		    System.out.println("Name:" + name);
		    System.out.println("ID:"+ id);
		    System.out.println();
		    
		  //将光标移到下一行
		    System.out.println("Moving cursor to the next row...");
		    
		    //处理结果集
		    System.out.println("Displaying record ...");
		    name = rs.getString("name");
		    id = rs.getInt("id");
		    //显示：
		    System.out.println("Name:" + name);
		    System.out.println("ID:"+ id);
		    System.out.println();
		    rs.close();
		    stmt.close();
		    conn.close();
		}catch(SQLException se){
			se.printStackTrace();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
				
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		  System.out.println("Happy Ending");  
		}
	}


