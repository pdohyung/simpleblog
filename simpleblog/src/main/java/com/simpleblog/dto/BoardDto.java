package com.simpleblog.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class BoardDto implements Serializable {

	private Long Id;
	private String title;
	private String content;
	private String author;
	private String createAt;

	@Builder
	public BoardDto(Long Id, String title, String content, String author, String createAt) {
		this.Id = Id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createAt = createAt;
	}
}
