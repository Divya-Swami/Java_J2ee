package com.jspiders.servlets.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyServlet14")
public abstract class MyServlet14 implements Servlet {

	static {
		
		System.out.println("Class is loaded");
	}
	
	{
		System.out.println("Object is loaded");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	        
		System.out.println("init is invoke");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("service is invoked");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() is invoked");
		
	}
}
