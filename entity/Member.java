package com.example.Myfirstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class Member {
    @Id //대푯값
    @GeneratedValue //대푯값을 자동으로 생성
    private Long id;

    @Column
    private String email;

    @Column
    private String password;
}
