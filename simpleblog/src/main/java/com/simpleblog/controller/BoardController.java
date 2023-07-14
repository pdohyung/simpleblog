package com.simpleblog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleblog.entity.Board;
import com.simpleblog.dto.BoardDto;
import com.simpleblog.repository.BoardRepository;
import com.simpleblog.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BoardController {
	private final BoardRepository boardRepository;

	private final BoardService boardService;

	@GetMapping("/boards/list")
	public List<BoardDto> getBoardList(){
		return boardService.getBoardList();
	}

	@GetMapping("/board")
	public Board hello(){
		return boardRepository.findById(1L).orElseThrow(() -> new IllegalArgumentException("dsds"));
	}
}
