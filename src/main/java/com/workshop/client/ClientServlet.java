package com.workshop.client;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.*;

public class ClientServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException {
				PrintWriter out = response.getWriter();
				//out.println("Hi from ClientServlet");
				throw new IOException("This is an IOException");
				/*try {
					request.getRequestDispatcher("test.jsp").forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					out.println("An exception in ClientServlet:"+e.getMessage());
				}*/
			}
}
