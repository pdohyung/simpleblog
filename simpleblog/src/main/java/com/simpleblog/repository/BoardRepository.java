package com.simpleblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpleblog.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
