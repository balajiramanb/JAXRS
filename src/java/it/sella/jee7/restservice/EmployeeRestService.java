/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import  javax.ws.rs.PUT;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author lenovo
 */
@Path("EmployeeRest")

public class EmployeeRestService {
    
    @Path("/allEmployee")
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  //  @MyFillter
    public List<Employee> getAllEmployee() {
        System.out.println("Employee Rest Service ");
        return new EmployeeService().getEmployeeList();
    }
    

    @PUT
     @Path("/addEmployee")
@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response addEmployee( Employee employee) {
        System.out.println(">>>>>>>>>>>>");
      //   new EmployeeService().addEmployees(id,employee.getName());
    
        new EmployeeService().addEmployees(employee.getId(),employee.getName());
         List<Employee>  list=  new EmployeeService().getEmployeeList();
        return Response.ok().entity(list.get(list.size()-1)).build();
        
    }
}
