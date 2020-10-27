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
@WebServlet("/hi")
public class Nana extends HttpServlet{
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
//			out.println((i+1)+": 안녕 Servlet!!<br />");
/**
 * url 뒤에 ?를 붙여서 인자를 넘기는 QueryString을 사용하여 건내받은 인자를 활용하는법을 배워보기
 * 2020-10-27		
 */
//			int cnt = Integer.parseInt(req.getParameter("cnt"));
			// url 뒤에 ?cnt= 인자를 넘겨받아 인자 수 만큼 안녕 servlet을 출력하는 코드
//			for(int i=0; i<cnt; i++) {
				/*한글이 깨지는 이유
				 * 1. 서버에서 한글을 지원하지않는 문자코드로 인코딩 한 경우
				 * 2. 서버에서는 utf-8로 인코딩해서 보냈지만 브라우저가 다른 코드로 잘못 해석한 경우
				 */
//				out.println((i+1)+": 안녕 Servlet!!<br />");
//			}
/**
 * 사용자가 인자를 넘기지 않았을 경우 500 에러가 나지않도록 기본값을 사용하는 방법을 배워보기
 * 2020-10-27			
 */
		/*
		 * 사용자가 인수를 넘길때 발생할 수 있는 경우의 수
		 * localhost8080/hi?cnt=3 값을 제대로 넘겼을 때 > "3"이 들어옴
		 * localhost8080/hi?cnt=  값을 입력하지 않았을 때 > "" 빈문자열이 들어옴
		 * localhost8080/hi?      cnt도 값도 입력하지 않았을 때 > null
		 * localhost8080/hi       >null
		 */
		//cnt를 받을 임시변수 생성
		String temp = req.getParameter("cnt");
		int cnt = 100;
		
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);			
		}
		for(int i=0; i<cnt; i++) {
				out.println((i+1)+": 안녕 Servlet~~<br />");
			}
			
	}
}
