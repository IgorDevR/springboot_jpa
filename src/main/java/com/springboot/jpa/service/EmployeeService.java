package com.springboot.jpa.service;


import com.springboot.jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(long id);
    public void deleteEmployee(long id);


}
