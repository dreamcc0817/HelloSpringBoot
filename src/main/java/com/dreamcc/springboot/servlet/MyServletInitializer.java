package com.dreamcc.springboot.servlet;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Title: Demo
 * @Package: com.dreamcc.springboot.servlet
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/7/30 8:35
 * @Version: V1.0
 */
public class MyServletInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet",MyServlet.class);
		myServlet.addMapping("/custom/**");
	}
}
