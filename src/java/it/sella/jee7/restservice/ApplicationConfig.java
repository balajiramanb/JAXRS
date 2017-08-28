/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author lenovo
 */
@javax.ws.rs.ApplicationPath("EmployeeService")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(it.sella.jee7.restservice.ClientFillter.class);
            resources.add(it.sella.jee7.restservice.EmployeeClientServices.class);
              resources.add(it.sella.jee7.restservice.EmployeeRestService.class);
                 resources.add(it.sella.jee7.restservice.ServletRequestSample.class);
                    
            
     
    }
    
}
