package kr.cloudstudying.blog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// JSON 데이터를 반환하는 컨트롤러!
// JSON이란? JavaScript Object Notation
// 데이터를 자바스크립트 객체로 표현한 것.
// ex) Cat { name: "네로", age: 3 }
// 자세한 내용은 추후 다시 다룸!
@RestController
public class HelloController {

    @GetMapping("/hello") // localhost:8080/hello 로 요청이 들어오면 실행!
    public String hello() {
        return "hello, world!"; // 반환할 데이터!
    }

    @GetMapping("/greetings")
    public String greetings() {
        return "반가워, 잘 부탁해!";// 반환할 데이터
    }
}
