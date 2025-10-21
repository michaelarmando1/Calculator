package com.michaelarmando.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int sum(int a, int b) {
        return a + b;
    }
}
