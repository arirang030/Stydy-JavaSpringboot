package com.example.Myfirstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//이 파일이 컨트롤러임을 선언
public class FirstController {
    @GetMapping("/hi")
    //웹 브라우저에서 localhost:8080/hi(클라이언트의 요청)로 접속하면 greetings.mustache 파일을 찾아 반환
    public String niceToMeetYou(Model model) {  //변수 username을 관리할 model 객체 받아 오기
        model.addAttribute("username", "ari");
        return "greetings"; //해당 뷰 템플릿 페이지를 templates 디렉토리에서 찾아 웹 브라우저에 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username", "ari");
        return "goodbye";
    }
}
