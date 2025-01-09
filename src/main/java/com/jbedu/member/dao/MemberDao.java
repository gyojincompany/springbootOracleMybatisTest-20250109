package com.jbedu.member.dao;

import java.util.ArrayList;

import com.jbedu.member.dto.MemberDto;

public interface MemberDao {
	
	public void joinMemberDao(String mid, String mpw, String mname, String memail, String mage); //회원가입
	public ArrayList<MemberDto> memberListDao(); //모든 회원 목록 불러오기
	public void memberDeleteDao(String mid); //회원 삭제

}
