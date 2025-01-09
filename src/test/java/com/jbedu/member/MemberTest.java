package com.jbedu.member;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.jbedu.member.dao.MemberDao;
import com.jbedu.member.dto.MemberDto;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
//테스트용으로 사용할 DB 설정 파일을 불러와 사용할 수 있음
public class MemberTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	@DisplayName("모든 회원 목록 불러오기 테스트") //테스트의 이름
	public void memberList() {
		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
		ArrayList<MemberDto> memberDtos = mDao.memberListDao(); //모든 회원 목록 불러오기
		
		for(MemberDto memberDto:memberDtos) {
			System.out.print(memberDto.getMid()+"/");//회원 아이디
			System.out.print(memberDto.getMname()+"/");//회원 이름
			System.out.print(memberDto.getMemail()+"/");//회원 이메일
			System.out.print(memberDto.getMage()+"/");//회원 나이			
			System.out.print(memberDto.getMdate()+"\n");//회원 가입일
			
		}		
	}
	
//	@Test
//	@DisplayName("회원 가입 테스트")
//	public void memberJoin() {
//		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
//		mDao.joinMemberDao("whiteTiger88", "12345", "홍칠칠", "777@abc.com", "28");
//		
//		memberList();
//	}
	
	@Test
	@DisplayName("회원 삭제 테스트")
	public void memberDelete() {
		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
		mDao.memberDeleteDao("whiteTiger88");
		
		memberList(); //전체 회원 목록 다시 출력
	}
}
