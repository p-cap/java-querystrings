package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class QueryStrings {
       @GetMapping("/math/calculate")
        public int getOperation(
                @RequestParam("operation") String operation,
                @RequestParam("x") int x,
                @RequestParam("y") int y
        ) {
            int result = 0;
            if (operation.equals("add")){
                result = x + y;
            } else if (operation.equals("subtract")) {
                result = x - y;
            }
            else if (operation.equals("multiply")) {
                result = x * y;
            } else {
                result = x / y;
            }
            return result;
        }
}

