package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {
	MemberDto selectMemberId();
	MemberDto selectMemberName();
}
