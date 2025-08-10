package com.demo.lab3;

public class InternationalMovie extends Movie{
    private String country;
    private String language;
    //    Mandatory Constructor
    public InternationalMovie(String moviename,String producedBy,String directedBy,int duration,int year,String category,String country,String language){
        super(moviename,producedBy,directedBy,duration,year,category);
        //        check for null
        if(moviename=="" || producedBy==""){
            throw new IllegalArgumentException("Movie Name and Produced By cant be Null");
        }
        this.country=country;
        this.language=language;
    }

    public void IntShowDetails() {
        System.out.println("Country :"+country+"\n"+"Language :"+language);

    }
}
