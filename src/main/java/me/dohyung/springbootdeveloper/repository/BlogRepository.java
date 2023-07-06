package me.dohyung.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dohyung.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
