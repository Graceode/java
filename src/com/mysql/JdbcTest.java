package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//�����ʱ��Ҫע��

//import com.java.jdbc.Connection;
//import com.java.jdbc.Statement;

public class JdbcTest {
	//JDBC���������ƺ����ݿ��ַ
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//���ݿ������Ϊtest
	static final String DB_URL = "jdbc:mysql://localhost/test?useSSL=false";
	//���ݿ��û�������
	static final String USER = "root";
	static final String PASS="root";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try{
			//ע��JDBC��������
			Class.forName("com.mysql.jdbc.Driver");
			//������
			System.out.println("Connecting to database");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Creating statement");
			//���������ResultSet,˫��ֻ��
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
			String sql;
			sql = "SELECT name,id FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			//������Ƶ����һ��
			System.out.println("Moving cursor to the last...");
		    rs.last();
		    //��������
		    System.out.println("Displaying record ...");
		    String name = rs.getString("name");
		    int id = rs.getInt("id");
		    //��ʾ��
		    System.out.println("Name:" + name);
		    System.out.println("ID:"+ id);
		    System.out.println();
		    //������Ƶ���һ��
		    System.out.println("Moving cursor to the first row...");
		    rs.first();
		    //��������
		    System.out.println("Displaying record ...");
		    name = rs.getString("name");
		    id = rs.getInt("id");
		    //��ʾ��
		    System.out.println("Name:" + name);
		    System.out.println("ID:"+ id);
		    System.out.println();
		    
		  //������Ƶ���һ��
		    System.out.println("Moving cursor to the next row...");
		    
		    //��������
		    System.out.println("Displaying record ...");
		    name = rs.getString("name");
		    id = rs.getInt("id");
		    //��ʾ��
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


