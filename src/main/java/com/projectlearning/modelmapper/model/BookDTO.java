package com.projectlearning.modelmapper.model;

import java.util.Date;
import lombok.Data;

@Data
public class BookDTO {
	private String title;
	private String author;
	private CurrencyType currencyType;
	private Date publishedAt;
	private Long price;
}
