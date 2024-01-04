package com.laze.outrun.backend.common.controller;

import com.laze.outrun.backend.common.domain.sample.dto.SampleResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController 컨트롤러를 JSON을 반환하는 컨트롤러로 만듦
@RestController
public class LoginController {

    // @GetMapping HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌
    @GetMapping("/login")
    public String login(){

        return "login";

    }

    // @RequestParam 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    // 여기서는 외부에서 name(@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 name(String name)에 저장
    @GetMapping("/login/dto")
    public SampleResponseDto sampleDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new SampleResponseDto(name, amount);
    }
}
