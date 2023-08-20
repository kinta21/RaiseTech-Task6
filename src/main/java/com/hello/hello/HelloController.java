package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController{

    @GetMapping("/hello")
    public String hello() {
        LocalDateTime nowDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" yyyy年MM月dd日  E曜日　HH時mm分ss秒");
        String formatNowDate = formatter.format(nowDate);
        return "Hello World!!　 日本は現在" + formatNowDate;
    }
}
