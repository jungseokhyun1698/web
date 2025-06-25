package com.example.kopoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 애너테이션 - 일종의 메타데이터
public class HelloController {
    // 변수는 직관적으로 이해 가능한 언어를 활용
    @GetMapping("/hello") // url 요청 받는 주소
    public String hello(Model model){
        // model.addAttribute();
        model.addAttribute("username", "개똥이");
        // 머스테치를 호출하는 방법
        // 리턴 시 파일명을 넘겨준다.
        return "hello";
    }
    @GetMapping("/seeyou")
    public String seeyou(Model model){
        model.addAttribute("username", "개똥이");
        return "seeyou";
    }
}
