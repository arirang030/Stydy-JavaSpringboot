package com.example.Myfirstproject.dto;

import com.example.Myfirstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//DTO
//사용자가 입력한 폼 데이터(제목, 내용)를 받는 그릇(객체)

@AllArgsConstructor //생성자 간소화 어노테이션
@ToString           //ToString 메서드 간소화 어노테이션
public class ArticleForm {
    private Long id;
    private String title;   //제목을 받을 필드
    private String content; //내용을 받을 필드

    //title과 content를 매개변수로 하는 생성자 자동 생성

    //데이터를 잘 받았는지 확인할 ToString() 메서드 자동 생성

    public Article toEntity() {
        //DTO를 엔티티로 변환
        return new Article(id, title, content);
    }
}
