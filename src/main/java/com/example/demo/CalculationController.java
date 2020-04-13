package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController
{
@Autowired
RabbitMQSender rabbitMQSender;
@Autowired
CalculationNumber calculationNumber;
    @GetMapping("/a")
    public void add(@RequestParam("n1") Long n1, @RequestParam("n2") Long n2)
    {
        calculationNumber.setN1(n1);
        calculationNumber.setN2(n2);
        System.out.println(n1+" "+n2);
        rabbitMQSender.send(calculationNumber);
    }

    @GetMapping("la")
    public String as()
    {
        return "as";
    }

}
