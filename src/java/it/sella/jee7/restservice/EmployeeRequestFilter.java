/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.io.IOException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

/**
 *
 * @author lenovo
 */
public class EmployeeRequestFilter implements ClientRequestFilter  {

    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
       if (clientRequestContext.getMethod().equalsIgnoreCase("GET")) {
           System.out.println("it.sella.jee7.restservice.EmployeeRequestFilter.filter()");
       }
    }
    
}
