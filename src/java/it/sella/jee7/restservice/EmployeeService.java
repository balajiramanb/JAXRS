/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class EmployeeService {
    
    private static  List<Employee> employeeList = new ArrayList<>();
    public List<Employee> getEmployeeList() {

        return employeeList;
    }
    
      public void addEmployees(Long id,String name) {
       employeeList.add(new Employee(id,name));
        
    }
}
