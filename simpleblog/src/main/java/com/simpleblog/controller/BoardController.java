package com.simpleblog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simpleblog.entity.Board;
import com.simpleblog.dto.BoardDto;
import com.simpleblog.repository.BoardRepository;
import com.simpleblog.request.BoardEdit;
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

	@GetMapping("/boards/{boardId}")
	public BoardDto getBoard(@PathVariable Long boardId){
		return boardService.getBoard(boardId);
	}

	@PostMapping("/boards")
	public Board create(@RequestBody BoardDto boardDto){
		return boardService.create(boardDto);
	}

	@PatchMapping("/boards/{boardId}")
	public Board edit(@PathVariable Long boardId, @RequestBody BoardEdit boardEdit){
		return boardService.edit(boardId, boardEdit);
	}

	@DeleteMapping("/boards/{boardId}")
	public void delete(@PathVariable Long boardId){
		boardService.delete(boardId);
	}
}
