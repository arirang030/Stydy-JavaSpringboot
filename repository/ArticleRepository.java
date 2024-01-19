package com.example.Myfirstproject.repository;

import com.example.Myfirstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//CrudRepository는 JPA에서 제공하는 인터페이스
//이를 상속해 엔티티를 관리(생성, 조회, 수정, 삭제)
public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
