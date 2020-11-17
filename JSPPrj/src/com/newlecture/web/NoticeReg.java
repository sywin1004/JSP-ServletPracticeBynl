package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
/**
 * JSP/Servlet을 뉴렉처 유튜브를 보며 배워보기
 * 2020-10-27
 * @author passw
 *
 */
//anotation 으로 페이지 매핑 xml 3.0부터 가능
// notice-reg url을 담당하는 servlet코드
@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자가 보내는 언어를 utf-8로 변경
		resp.setCharacterEncoding("UTF-8");
		// 사용자에게 받은 언어를 utf-8로 읽는 코드
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
//		// hello servlet 글자 앞에 1 ~ 100 까지 붙여서 출력
//		for(int i=0; i<100; i++) {
//			/*한글이 깨지는 이유
//			 * 1. 서버에서 한글을 지원하지않는 문자코드로 인코딩 한 경우
//			 * 2. 서버에서는 utf-8로 인코딩해서 보냈지만 브라우저가 다른 코드로 잘못 해석한 경우
//			 */

/**
 * Post요청을 이용하여 많은 정보를 보내는 방법			
 */

		//notice-reg페이지에서 title과 content의 내용을 넘겨받는 코드
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		//사용자에게 다시 출력해주는 코드
		out.println(title);
		out.println(content);
			
	}
}
