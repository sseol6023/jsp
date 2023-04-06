package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출기");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// 겟 방식은 주소창에 다 뜸. 포스트로 하면 오류남. 보여줄 데이터가 많지 않거나 보안이 필요 없으면 쓰기 -> 보안이 필요하면 쿠키와 세션
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		out.println("<html><body>");
		
		if(user_id != null && user_id.length() != 0) {
			out.println("이미 로그인 상태입니다!<br><br>");
			out.println("첫 번째 서블렛에서 넘겨준 아이디: " + user_id + "<br>");
			out.println("첫 번째 서블렛에서 넘겨준 비밀번호: " + user_pw + "<br>");
			out.println("첫 번째 서블렛에서 넘겨준 주소: " + user_address + "<br>");
			out.println("</body></html>");
			
		} else {
			out.println("로그인 하지 않았습니다.<br><br>");
			out.println("다시 로그인하세요!!<br>");
			out.println("<a href='/Chapter09/login2.html'>로그인창으로 이동하기 </>");
		}
		
	}

}
