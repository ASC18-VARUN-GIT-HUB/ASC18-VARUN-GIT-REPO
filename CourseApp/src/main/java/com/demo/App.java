package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.err.println( "App is Starting!" );
        SpringApplication.run(App.class,args);
        System.err.println("App in Live Mode");

    }
}
