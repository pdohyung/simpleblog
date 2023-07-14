package com.simpleblog.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createdAt;

	@Builder
	public Board(String title, String content, String author, LocalDateTime createdAt) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.createdAt = createdAt;
	}
}
