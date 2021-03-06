package com.projectlearning.modelmapper.model;

import java.util.Date;

import lombok.Data;

@Data
public class BookVO {
	private String title;
	private String author;
	private CurrencyType currencyType;
	private String createAt;
	private Long price;
}
