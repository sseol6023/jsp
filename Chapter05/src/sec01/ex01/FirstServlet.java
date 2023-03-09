package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {  //인서트 하기 위해서는 컨트롤쉬프트오(임폴트가 나타난다)

	@Override  //소스->오버라이딩 메소드->찾아서 오케이
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget 메서드 호출");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory 메서드 호출");
	}
	
	
	

}
