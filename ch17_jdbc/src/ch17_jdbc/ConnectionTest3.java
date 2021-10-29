package ch17_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest3 {
	public static void main(String[] args) {
		
		try {
			//1.�������̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�ε��� ����̹��κ��� ���ᰴü ����
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","madang","madang");
													//���񽺸�(sid) xe ,������(sid) orcl , 
			if(con!=null) {
				System.out.println("���Ἲ��");
				
			}else {
				System.out.println("�������");
			}
			//3.������ ������ȸ
			Statement stmt = con.createStatement();
			//4. ������ �ۼ� (�����Ȱ�ü��)
			StringBuffer sb = new StringBuffer();
			sb.append("select bookid,bookname,publisher,price from book order by bookid");
			//5.��ȸ ��ü ���� �� ��� �ޱ�
			ResultSet rs=stmt.executeQuery(sb+"");//��Ʈ������Ÿ��+��Ʈ���ؼ� ��Ʈ������ ǥ��
			while(rs.next()){//�������̶� �ݺ�������
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String publisher = rs.getString(3);
				int price = rs.getInt(4);
				System.out.println(bookid+"\t"+bookname+"\t"+publisher+"\t"+price);
				}
			//6.�ڿ� ����
			rs.close();
			stmt.close();
			con.close();
			}catch (Exception e) {
			
		}
	}
}