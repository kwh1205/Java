package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//자바프로그램은 dbms저장 default 옵션이 autocommit <- commit 명령 실행하지 않아도 db에 자동 반영
public class InsertTest4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1.드라이버로딩 2.연결객체생성 
		try {
			 
			Connection con = DaoConnector.getInstance().getConnection();
			//3.쿼리객체생성
			Statement stmt = con.createStatement();
			System.out.println("등록할 고객명을 입력하세요");
			String name = scanner.nextLine();
			System.out.println("등록할 주소명을 입력하세요");
			String address = scanner.nextLine();
			System.out.println("등록할 전화번호를 입력하세요");
			String phone = scanner.nextLine();
			//4.쿼리문 생성
			String sql = "insert into customer(custid,name,address,phone) "
					+ " values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"')";
		//5-1.쿼리 전송및 결과받기	
		//executeUpdate(쿼리문) 리턴타입은 int 삽입된 행의 수 리턴
			stmt.executeUpdate(sql);
		//5-2 결과 조회
			sql = "select * from customer order by custid";
		//조회
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
			
			
		}catch (Exception e) {
			
		}
		
		
		//6.자원해제
	}
}
