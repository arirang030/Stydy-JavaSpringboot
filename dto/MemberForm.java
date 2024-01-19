package com.example.Myfirstproject.dto;

import com.example.Myfirstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
//DTO
public class MemberForm {
    private Long id;
    private String email;
    private String password;

    //전송받으 폼 데이터를 필드에 저장하는 생성자 자동 생성

    //필드에 잘 담겼는지 학인하는 메서드 자동 생성

    public Member toEntity() {
        return new Member(id, email, password);
    }
}
