package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class CalcService {
    public int add(OperationModel model){
        return model.getA() + model.getB();
    }

    public int subtract(OperationModel model){
        return model.getA() - model.getB();
    }

    public int multiply(OperationModel model){
        return model.getA() * model.getB();
    }

    public double divide(OperationModel model){
        if(model.getA() == 0) return 0;
        if(model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }

    public int faktorialis(OperationModel model) {
        return faktorialis(model.getC());
    }

    private int faktorialis(int n){
        return n < 2 ? n : n * faktorialis(n-1);
    }

    public int fib(OperationModel model){
        return fib(model.getC());
    }

    private int fib(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else if(n == 2) return 1;
        else return fib(n-1) + fib(n-2);
    }

    public double sqrt(OperationModel model){
        return Math.sqrt(model.getC());
    }

    public int power(OperationModel model){
        return model.getC() * model.getC();
    }

    public OperationModel clearSimple(OperationModel model){
        model.setA(0);
        model.setB(0);
        return model;
    }

    public OperationModel clearAdvanced(OperationModel model){
        model.setC(0);
        return model;
    }
}
