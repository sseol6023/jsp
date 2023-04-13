package sec04.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.jdbc.pool.DataSource;

public class MemberDAO {
	/*
	private static final String driver = "oracle.jdbc.driver.OracleDriver";

	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";

	private static final String user = "scott";

	private static final String pwd = "1111";
	*/

	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO()
	{
		try
		{
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	// private Statement stmt;
	
	public List<MemberVO> listMebers()
	{
		List<MemberVO> list = new ArrayList<MemberVO>();
		try
		{
			// connDB();
			con = dataFactory.getConnection();
			String query = "select * from t_member";
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			while (rs.next())
			{
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean isExisted(MemberVO memberVO) {
		boolean result = false;
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		try {
			con = dataFactory.getConnection();
			
			// decode는 if else랑 비슷함. 
			//deCode() 함수를 이용하여 SQL문으로 회원정보를 조회
			// 아이디와 비밀번호가 테이블에 있으면 true를 반환하고 없으면 false를 반환
			// 안되면 1대신 0을 넣어보자(하나만 널 값이 뜨면 유저아이디, 유저패스워드 중 오류가 있다는 얘기)
			String query = "select decode(count(*),1,'true','false') as result from t_member";
			query += " where id=? and pwd=?";
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result=" + result);
			//result가 트루면 잘 되는 거, 펄스면 안 되는 거
			System.out.println("id=" + id);
			System.out.println("pwd=" + pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	private void connDB()
	{
		try
		{
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			stmt = con.createStatement();
			System.out.println("Statement 생성 성공");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	*/

}
