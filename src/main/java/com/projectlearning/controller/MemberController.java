package com.projectlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.projectlearning.dto.MemberDTO;
import com.projectlearning.service.impl.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MemberController {
	
	@Autowired
	MemberServiceImpl memberServiceImpl;
	
	@PostMapping("/checkMember")
	public String checkMember(@RequestBody MemberDTO memberDTO) {
		log.info("------------"+String.valueOf(MemberController.class)+"------------");
		
		String message = "";
		MemberDTO mDto = memberServiceImpl.checkMember(memberDTO);
		if(mDto != null) {
			message = "회원입니다";
		} else {
			message = "회원이 아닙니다";
		}
		return message;
	}

}
