package com.mysql;

public class JdbcTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��ȡ���ں�ʱ���ʽ
		Ϊ�˺�����SQL���������Ա����Ծ�ֱ��д����java.util.Date��
		Ҳ��������java.util.Date����Ȼ������Date��
		*/
		java.util.Date javaDate = new java.util.Date();
		long javaTime = javaDate.getTime();
		System.out.println("The java Date is:"+javaDate.toString());

		//��ȡSQL������
		java.sql.Date sqlDate = new java.sql.Date(javaTime);
		System.out.println("The SQL Date is:"+sqlDate.toString());
		//��ȡSQL��ʱ���
		java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
		System.out.println("The SQL TimeSTAMP is :"+ sqlTimestamp.toString());
		
		
		
	}

}
