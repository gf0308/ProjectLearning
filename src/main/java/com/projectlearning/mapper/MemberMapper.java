package com.projectlearning.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.projectlearning.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	
	public MemberDTO checkMember(MemberDTO memberDTO);

}
