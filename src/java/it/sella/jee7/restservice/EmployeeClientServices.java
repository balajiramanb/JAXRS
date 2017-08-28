/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author lenovo
 */
@Path("EmployeeClientRest")
public class EmployeeClientServices {
    @Path("/allEmployee")
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<Employee> getAllEmployee() {

        try {
        Client client = ClientBuilder.newClient();
      WebTarget target = client.target("http://localhost:8084/RestApplication/EmployeeService/EmployeeRest/allEmployee");
     return   target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Employee>>() {});
      
    //  response = target.request().get();
      //   System.out.println("TEST>>>>>>>>"+response.getEntity());
        // return   response.readEntity( List.class);
      //  return null;
        }finally{
            //response.close();
        }
    
    //return null;
   //
  
    }
    

     @GET
     @Path("/addEmployee/{id}/{name}")
   @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Employee addEmployee(@PathParam("id") Long id,@PathParam("name") String name) {
         System.out.println("it.sella.jee7.restservice.EmployeeClientServices.addEmployee()");
          System.out.println("name"+name);
          System.out.println("id"+id);
             try {
                 Employee emp = new Employee(id, name);
        Client client = ClientBuilder.newClient();
      WebTarget target = client.target("http://localhost:8084/RestApplication/EmployeeService/EmployeeRest/addEmployee");
     return  target.request().put(Entity.entity(emp, MediaType.APPLICATION_JSON),Employee.class);
      
        }finally{
            //response.close();
        }

    //  response = target.request().get();
      //   System.out.println("TEST>>>>>>>>"+response.getEntity());
        // return   response.readEntity( List.class);
      //  return null;
      //  }finally{
            //response.close();
       // }
    }
}
