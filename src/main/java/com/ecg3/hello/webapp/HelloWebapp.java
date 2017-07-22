package com.ecg3.hello.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ecg3.hello.service.HelloWorldService;

@Path("/hello")
public class HelloWebapp 
{
   private static HelloWorldService service = new HelloWorldService();

   @GET()
   public String hello() 
   {
      return service.sayHello();
   }
}
