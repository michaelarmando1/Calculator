package com.michaelarmando.calculator.Controller;

import com.michaelarmando.calculator.CalculatorApplication;
import com.michaelarmando.calculator.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculator;
    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
