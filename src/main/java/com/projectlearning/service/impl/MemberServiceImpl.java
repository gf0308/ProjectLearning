package com.projectlearning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectlearning.dto.MemberDTO;
import com.projectlearning.mapper.MemberMapper;
import com.projectlearning.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper memberMapper;

	@Override
	public MemberDTO checkMember(MemberDTO memberDTO) {
		log.info("------------"+String.valueOf(MemberServiceImpl.class)+"------------");
		return memberMapper.checkMember(memberDTO);
	}
	
	
	
}
