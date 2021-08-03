package com.projectlearning.modelmapper.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import com.projectlearning.modelmapper.model.BookDTO;
import com.projectlearning.modelmapper.model.BookVO;

public class ModelMapperServiceTest { // 테스트클래스는 관습에 따라 "테스트클래스명+Test"라고 이름을 붙인다
	
	/*@Test		// @Test 애너테이션을 붙임 -> 본 메서드가 단위테스트 메서드임을 나타냄
	public void testSum() { // 테스트용 메서드는 "test+테스트메서드명" 식으로 이름을 붙인다(관습에따라)
		ModelMapperService mms = new ModelMapperService();
		double result = mms.sum(10, 50);
		assertEquals(60, result, 0);
	}*/
	
	@Test
	public void testTestModelMapper() {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setTitle("LOTR");
		bookDTO.setPrice(2000L);
		bookDTO.setAuthor("J.R.R.Tolkin");
		bookDTO.setPublishedAt("1910/01/01");
		
		ModelMapperService mms = new ModelMapperService();
		BookVO bookVO = mms.testModelMapper(bookDTO);
		
		System.out.println("[title] "+bookVO.getTitle());
		System.out.println("[author] "+bookVO.getAuthor());
		System.out.println("[price] "+bookVO.getPrice());
		System.out.println("[createAt] "+bookVO.getCreateAt());
		
//		assertEquals(bookDTO.getAuthor(), bookVO.getAuthor());
	}
	
	
	
}
