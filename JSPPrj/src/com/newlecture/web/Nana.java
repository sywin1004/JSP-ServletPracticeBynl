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
@WebServlet("/hi")
public class Nana extends HttpServlet{
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
//			out.println((i+1)+": �ȳ� Servlet!!<br />");
/**
 * url �ڿ� ?�� �ٿ��� ���ڸ� �ѱ�� QueryString�� ����Ͽ� �ǳ����� ���ڸ� Ȱ���ϴ¹��� �������
 * 2020-10-27		
 */
//			int cnt = Integer.parseInt(req.getParameter("cnt"));
			// url �ڿ� ?cnt= ���ڸ� �Ѱܹ޾� ���� �� ��ŭ �ȳ� servlet�� ����ϴ� �ڵ�
//			for(int i=0; i<cnt; i++) {
				/*�ѱ��� ������ ����
				 * 1. �������� �ѱ��� ���������ʴ� �����ڵ�� ���ڵ� �� ���
				 * 2. ���������� utf-8�� ���ڵ��ؼ� �������� �������� �ٸ� �ڵ�� �߸� �ؼ��� ���
				 */
//				out.println((i+1)+": �ȳ� Servlet!!<br />");
//			}
/**
 * ����ڰ� ���ڸ� �ѱ��� �ʾ��� ��� 500 ������ �����ʵ��� �⺻���� ����ϴ� ����� �������
 * 2020-10-27			
 */
		/*
		 * ����ڰ� �μ��� �ѱ涧 �߻��� �� �ִ� ����� ��
		 * localhost8080/hi?cnt=3 ���� ����� �Ѱ��� �� > "3"�� ����
		 * localhost8080/hi?cnt=  ���� �Է����� �ʾ��� �� > "" ���ڿ��� ����
		 * localhost8080/hi?      cnt�� ���� �Է����� �ʾ��� �� > null
		 * localhost8080/hi       >null
		 */
		//cnt�� ���� �ӽú��� ����
		String temp = req.getParameter("cnt");
		int cnt = 100;
		
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);			
		}
		for(int i=0; i<cnt; i++) {
				out.println((i+1)+": �ȳ� Servlet~~<br />");
			}
			
	}
}
