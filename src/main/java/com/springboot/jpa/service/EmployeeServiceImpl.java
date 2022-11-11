package com.springboot.jpa.service;



import com.springboot.jpa.dao.EmployeeRepository;
import com.springboot.jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    @Transactional
    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }


    @Transactional
    public void deleteEmployee(long id) {
        employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        employeeRepository.deleteById(id);
    }
}
