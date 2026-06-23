package com.example.demo.runner;

import com.example.demo.service.OrderXmlConverter;

import java.nio.file.Path;

public class AppRunner {
    public static void main(String[] args) throws Exception {
        Path input = Path.of("src/main/resources/input/order.json");
        System.out.println(new OrderXmlConverter().convertFile(input));
    }
}
