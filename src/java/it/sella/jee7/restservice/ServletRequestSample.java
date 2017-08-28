/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.container.PreMatching;

import javax.ws.rs.ext.Provider;

/**
 *
 * @author lenovo
 */
@Provider
@PreMatching
//@MyFillter
public class ServletRequestSample implements ContainerRequestFilter{

    @Override
    public void filter(ContainerRequestContext crc) throws IOException {
       System.out.println( crc.getMethod());
      System.out.println(crc.getUriInfo().getBaseUri());
     //To change body of generated methods, choose Tools | Templates.
    }
    
}
