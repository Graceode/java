package com.mysql;

public class JdbcTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*获取日期和时间格式
		为了和下面SQL的日期做对比所以就直接写明是java.util.Date类
		也可以引入java.util.Date包。然后声明Date类
		*/
		java.util.Date javaDate = new java.util.Date();
		long javaTime = javaDate.getTime();
		System.out.println("The java Date is:"+javaDate.toString());

		//获取SQL的日期
		java.sql.Date sqlDate = new java.sql.Date(javaTime);
		System.out.println("The SQL Date is:"+sqlDate.toString());
		//获取SQL的时间戳
		java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
		System.out.println("The SQL TimeSTAMP is :"+ sqlTimestamp.toString());
		
		
		
	}

}
