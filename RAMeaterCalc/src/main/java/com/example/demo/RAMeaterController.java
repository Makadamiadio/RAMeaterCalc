package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RAMeaterController {
    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalcService calculateSimple;

    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "geci";
    }

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.subtract(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="fibonacci", method = RequestMethod.POST)
    public String fibonacci(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.fib(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.sqrt(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.power(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="factorial", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.faktorialis(operationModel));
        return "geci";
    }

    @RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "geci";
    }

    @RequestMapping(value="/calculator", params="clearAdvanced", method = RequestMethod.POST)
    public String clearAdvanced(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearAdvanced(operationModel));
        model.addAttribute("result", 0);
        return "geci";
    }
}
