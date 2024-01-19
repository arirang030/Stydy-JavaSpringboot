package com.example.Myfirstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //생성자 자동 생성 어노테이션
@NoArgsConstructor  //기본 생성자 자동 생성 어노테이션
@ToString
@Entity
@Getter
//해당 클래스가 엔티티임을 선언
public class Article {
    @Id //대푯값, 엔티티 중 제목과 내용이 같은 것이 있더라도 대푯값 id로 다른 글임을 구분할 수 있음
    @GeneratedValue(strategy = GenerationType.IDENTITY) //대푯값을 자동으로 생성
    private Long id;

    @Column //DB 테이블의 title 열과 연결됨
    private String title;

    @Column //DB 테이블의 content 열과 연결됨
    private String content;
}
