package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/Input")
public class InputServlet extends HttpServlet {
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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");  //유저아이디에 있는 벨류 값을 가져옴
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + "user_id");
		System.out.println("비밀번호 : " + "user_pw");
		
		
		String[] subject = request.getParameterValues("subject"); //이름이 서브젝트인 거 가져옴 근데 여러개니까 스트링 배열 설정
		System.out.print("선택한 과목 :  ");
		for(String str : subject) {
			System.out.print(str + ",  ");
		}
	}

}
