package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest6 {
	public static void main(String[] args) {
		 try {
			 //1.����̹� �ε�
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 //2.���ᰴü ����
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					                                          "madang", "madang");
			 if(con!=null) {
					System.out.println("���Ἲ��");
					
				}else {
					System.out.println("�������");
				}
			 //3.������ü ����
			 Statement stmt = con.createStatement();
			 //4.������ �ۼ�
			 //��ȸ ������ ���ڿ��� ���� ���ڿ�ǥ�� ''�� ��� where ���� ������ ���
			 String sql ="select bookid,bookname,publisher,price from book where bookname like'�౸�� ����'";
			 //5.������ ���� �� ��� �ޱ�
			 ResultSet rs = stmt.executeQuery(sql);
			 //6.����۾�
			 System.out.println("bookid| bookname| publisher| price");
			 System.out.println("---------------------------------");
			 if(rs.next()) {//�Ѱ��̶� if������ �������϶� while��
				 int bookid = rs.getInt(1);
				 String bookname = rs.getString(2);
				 String publisher = rs.getString(3);
				 int price =rs.getInt(4);
				 System.out.println(bookid+"|"+bookname+"\t|"+publisher+"\t|"+price);
			 }
			 //7.�ڿ�����
			 rs.close();    stmt.close();   con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }

		}
	}