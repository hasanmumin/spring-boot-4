package com.hasanmumin.springboot4;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping(version = "1", produces = MediaType.TEXT_PLAIN_VALUE)
    public Mono<String> sayHelloV1() {
        return Mono.just("Hello World Version:1");
    }

    @GetMapping(version = "2", produces = MediaType.TEXT_PLAIN_VALUE)
    public Mono<String> sayHelloV2() {
        return Mono.just("Hello World Version:2");
    }
}
