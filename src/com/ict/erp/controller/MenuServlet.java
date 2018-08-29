package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.MenuService;
import com.ict.erp.service.impl.MenuServiceImpl;
import com.ict.erp.vo.MenuInfo;

public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String uri;
    private MenuService ms = new MenuServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		try {
			if(cmd.equals("menuList")) {
				pw.println(ms.selectMenuList(null));
			}else if(cmd.equals("menuView")) {
				String meiNumStr = request.getParameter("meiNumStr");
				if(meiNumStr==null || meiNumStr.equals("")) {
					throw new SQLException("번호가 없음");
				}
				MenuInfo menu = new MenuInfo();
				menu.setMeiNum(Long.parseLong(meiNumStr));
				pw.println(ms.selectMenu(menu));
			}
		}catch(SQLException e) {
			pw.print("에러남");
			pw.print("에러이유 : " + e);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		request.setCharacterEncoding("utf-8");
		if(cmd.equals("menuInsert")) {
			
		}else if(cmd.equals("menuUpdate")) {
			
		}else if(cmd.equals("menuDelete")) {
			
		}
	}
	
}