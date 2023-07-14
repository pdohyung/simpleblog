package com.simpleblog.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Getter
public class BoardDto implements Serializable {

	private final Long Id;
	private final String title;
	private final String content;
	private final String author;
	private final String createAt;

	@Builder
	public BoardDto(Long Id, String title, String content, String author, String createAt) {
		this.Id = Id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createAt = createAt;
	}
}
