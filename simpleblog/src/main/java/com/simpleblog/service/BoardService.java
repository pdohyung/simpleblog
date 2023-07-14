package com.simpleblog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.simpleblog.entity.Board;
import com.simpleblog.dto.BoardDto;
import com.simpleblog.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;
	public List<BoardDto> getBoardList() {
		List<Board> boards = boardRepository.findAll();
		List<BoardDto> dtos = new ArrayList<>();
 		for (Board board : boards) {
			BoardDto dto = BoardDto.builder()
				.Id(board.getId())
				.title(board.getTitle())
				.content(board.getContent())
				.author(board.getAuthor())
				.build();
			dtos.add(dto);
		}
		 return dtos;
	}
}
