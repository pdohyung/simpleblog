package com.simpleblog.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
				.createAt(board.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")))
				.build();
			dtos.add(dto);
		}
		 return dtos;
	}

	public BoardDto getBoard(Long boardId) {
		Board findBoard = boardRepository.findById(boardId)
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 글입니다."));
		return BoardDto.builder()
			.Id(findBoard.getId())
			.author(findBoard.getAuthor())
			.title(findBoard.getTitle())
			.content(findBoard.getContent())
			.createAt(findBoard.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")))
			.build();
	}
}
