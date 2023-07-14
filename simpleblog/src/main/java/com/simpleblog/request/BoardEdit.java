package com.simpleblog.request;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BoardEdit {
	private final String title;
	private final String content;

	@Builder
	public BoardEdit(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
