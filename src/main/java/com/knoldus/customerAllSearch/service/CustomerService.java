package com.knoldus.customerAllSearch.service;

import com.knoldus.customerAllSearch.customerinterface.ICustomerService;
import com.knoldus.customerAllSearch.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public List<Employee> getAllCustomers() {
        String url= "http://localhost:8089/employee";
        List<Employee> responseEntity = restTemplate.getForObject(url, List.class);
        return responseEntity;
    }
}
