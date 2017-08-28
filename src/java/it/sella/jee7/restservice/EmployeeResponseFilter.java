/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.io.IOException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

/**
 *
 * @author lenovo
 */
public class EmployeeResponseFilter implements ClientResponseFilter {

    @Override
    public void filter(ClientRequestContext request, ClientResponseContext response) throws IOException {
    if( response.getStatus() ==200) {
        System.out.println("Response OK");
    }
    }
    
}
