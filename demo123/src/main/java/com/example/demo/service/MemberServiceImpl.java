package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	@Override
	public MemberDto getMemberId(){
		MemberDto mem = memberDao.selectMemberId();
		return mem;
	}
	
	public MemberDto getMemberName(){
		MemberDto mem = memberDao.selectMemberName();
		return mem;
	}
}
