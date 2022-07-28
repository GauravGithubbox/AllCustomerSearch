package com.knoldus.customerAllSearch.controller;

import com.knoldus.customerAllSearch.customerinterface.ICustomerService;
import com.knoldus.customerAllSearch.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Loblaw")
public class CustomerAllSearch {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/AllSearch")
    public List<Employee> getAllCustomers(){
       List<Employee> empDetails =  iCustomerService.getAllCustomers();
       return empDetails;
    }


}
