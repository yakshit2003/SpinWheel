package com.SpinModule.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SpinModule.dao.UserDao;
import com.SpinModule.entity.UserDetails;

@WebServlet(urlPatterns = "/register")
public class submitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public submitServlet() {
        // TODO Auto-generated constructor stub
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		RequestDispatcher rd=null;

		 String uname= request.getParameter("pname");
		String uemail= request.getParameter("pemail");
		String unumber=request.getParameter("pnumber");
		String ustate =request.getParameter("pstate");
		String udistrict=request.getParameter("pdistrict");
		
		if(uname==null || uname.equals("")) {
			request.setAttribute("status", "InvalidName");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		if(uemail==null || uemail.equals("")) {
			request.setAttribute("status", "InvalidEmail");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		if(unumber==null || unumber.equals("")) {
			request.setAttribute("status", "InvalidNumber");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		if(ustate==null || ustate.equals("")) {
			request.setAttribute("status", "InvalidState");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		if(udistrict==null || udistrict.equals("")) {
			request.setAttribute("status", "InvalidDistrict");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
//			
		   
		    UserDetails u = new UserDetails(uname, uemail, unumber, ustate, udistrict);
		    
//			boolean flagg=UserDao.duplicacy(u);
//			if(flagg) {
//				request.setAttribute("status1", "AlreadyExist");
//				rd=request.getRequestDispatcher("index.jsp");
//				rd.forward(request, response);
//				
//			}else {
				rd=request.getRequestDispatcher("spin.jsp");
				
			boolean f=UserDao.registerUser(u);
			
			if(f) {
				request.setAttribute("status", "Success");
				
			}
			else {
				request.setAttribute("status", "Failed");
				
			}
			rd.forward(request, response);
			
			
			}
		
			/*catch (SQLIntegrityConstraintViolationException p) {
			request.setAttribute("duplicateError", "error");
			RequestDispatcher Rd=request.getRequestDispatcher("index.jsp");
			Rd.forward(request, response);*/
			
		
	


}

