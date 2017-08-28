/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import javax.persistence.Entity;

/**
 *
 * @author lenovo
 */

public class Employee {
    private Long id;
    private String name;

    public Employee() {
        
    }
    public Employee(Long id,String name){
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
