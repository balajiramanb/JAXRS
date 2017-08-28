/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sella.jee7.json;

import it.sella.jee7.restservice.Employee;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;

/**
 *
 * @author lenovo
 */
public class JSONSample {
    public static void main(String args[]) {
       JsonReader jsonReader = Json.createReader(new StringReader("{" + "  \"apple\":\"red\","
               + ""                  + "  \"banana\":\"yellow\""                  + "}"));
        JsonObject json = jsonReader.readObject();
        System.out.println(json.getString("apple"));
        json.getString("banana");
        Employee employee = new Employee(1l, "employee");
              Employee employee2 = new Employee(2l, "employee2");
              List<Employee> employeeList = new ArrayList<>();
              employeeList.add(employee);
              employeeList.add(employee2);
        JsonObject jsonObj =Json.createObjectBuilder().add("id",employee.getId()).add("name", employee.getName()).build();
  
        System.out.println(jsonObj.toString());
        final JsonArrayBuilder arrayBuilder= Json.createArrayBuilder();
        arrayBuilder.add("employeeList");
        final JsonArrayBuilder employeeDetail =  Json.createArrayBuilder();
        employeeList.forEach(empl ->employeeDetail.add(Json.createObjectBuilder().add("id",empl.getId()).add("name", empl.getName())) );
    arrayBuilder.add(employeeDetail);
   System.out.println( arrayBuilder.build().toString());
JsonObject jsonArray=arrayBuilder.build().asJsonObject();
System.out.println(jsonArray.toString());
//jsonArray.forEach(j -> System.out.println(j.asJsonObject().toString()));
    }
}
