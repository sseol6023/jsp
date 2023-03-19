package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet4
 */
@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + user_id);
		System.out.println("비밀번호 : " + user_pw);
		
		if((user_id == null) || (user_id.length() == 0)) {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디를 입력하세요!!!");
			out.print("<br>");
			out.print("<a href='http://localhost:8070/Chapter06/test01/login.html'> 로그인 창으로 이동 </a>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print(user_id + "님!! 로그인 하셨습니다.");
			out.print("</body>");
			out.print("</html>");
		}
		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory 메서드 호출");
	}

}
