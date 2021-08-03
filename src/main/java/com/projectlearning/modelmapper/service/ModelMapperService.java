package com.projectlearning.modelmapper.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.projectlearning.modelmapper.model.BookDTO;
import com.projectlearning.modelmapper.model.BookVO;

@Service
public class ModelMapperService {
	
	/* 
	 * BookDTO의 내용을 BookVO로 convert해서 리턴해주는 경우
	 *  => 이렇게 하나하나 노가다 해야하면
	 *  -> 불편함 + 휴먼에러(실수)발생 가능높음
	 *  
	 *  ==> 이렇게 일일이 '특정필드에는 특정필드값으로 넣는다' 작업을 사람이 하지 않고,
	 *      이름에 맞춰 자동으로 해주는 라이브러리기능이 있다
	 *      => 'ModelMapper'
	 * 
	 */
	public BookVO convert(BookDTO bookDTO) {
		BookVO bookVO = new BookVO();
		bookVO.setTitle(bookDTO.getTitle());
		bookVO.setAuthor(bookDTO.getAuthor());
		bookVO.setCurrencyType(bookDTO.getCurrencyType());
		bookVO.setCreateAt(bookDTO.getPublishedAt());
		bookVO.setPrice(bookDTO.getPrice());
		
		return bookVO;
	}
	
	
	public BookVO test_use_model_mapper(BookDTO bookDTO) {
		ModelMapper modelMapper = new ModelMapper();
		BookVO bookVO = modelMapper.map(bookDTO, BookVO.class);
		
		return bookVO;
	}
	
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	
	
	

}
