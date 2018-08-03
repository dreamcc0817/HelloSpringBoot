package com.dreamcc.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title: Demo
 * @Package: ${PACKAGE_NAME}
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/7/30 8:40
 * @Version: V1.0
 */
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
