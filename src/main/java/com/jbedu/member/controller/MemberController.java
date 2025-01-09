package com.jbedu.member.controller;

import java.net.http.HttpRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.member.dao.MemberDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
	
	@Autowired 
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		String mage = request.getParameter("mage");
		
		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
		
		mDao.joinMemberDao(mid, mpw, mname, memail, mage);
		
		model.addAttribute("mid", mid);
		
		return "joinOk";
	}
	
}
