package com.projectlearning.base.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.projectlearning.base.dto.MemberDTO;


@Mapper
public interface MemberMapper {
	
	public MemberDTO checkMember(MemberDTO memberDTO);

}
