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
 * JSP/Servlet�� ����ó ��Ʃ�긦 ���� �������
 * 2020-10-27
 * @author passw
 *
 */
//anotation ���� ������ ���� xml 3.0���� ����
// notice-reg url�� ����ϴ� servlet�ڵ�
@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ڰ� ������ �� utf-8�� ����
		resp.setCharacterEncoding("UTF-8");
		// ����ڿ��� ���� �� utf-8�� �д� �ڵ�
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
//		// hello servlet ���� �տ� 1 ~ 100 ���� �ٿ��� ���
//		for(int i=0; i<100; i++) {
//			/*�ѱ��� ������ ����
//			 * 1. �������� �ѱ��� ���������ʴ� �����ڵ�� ���ڵ� �� ���
//			 * 2. ���������� utf-8�� ���ڵ��ؼ� �������� �������� �ٸ� �ڵ�� �߸� �ؼ��� ���
//			 */

/**
 * Post��û�� �̿��Ͽ� ���� ������ ������ ���			
 */

		//notice-reg���������� title�� content�� ������ �Ѱܹ޴� �ڵ�
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		//����ڿ��� �ٽ� ������ִ� �ڵ�
		out.println(title);
		out.println(content);
			
	}
}
