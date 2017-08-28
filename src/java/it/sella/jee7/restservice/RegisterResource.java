/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.restservice;

import java.lang.reflect.Method;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;

/**
 *
 * @author lenovo
 */
public class RegisterResource implements DynamicFeature  {

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext fc) {
       final String resourcePackage = resourceInfo.getResourceClass()
                .getPackage().getName();
        final Method resourceMethod = resourceInfo.getResourceMethod();
        System.out.println("RegisterResource "+resourcePackage);
         System.out.println("RegisterMethod "+resourceMethod.getName());
    }
    
}
