package com.demo.lab3;

public class Movie {
    private String moviename;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;
    private String movieId;
    private static int movieCount=0;

    //    mandatory  fields constructor
    public Movie(String moviename,String producedBy){
        //        check for null
        if(moviename=="" || producedBy==""){
            throw new IllegalArgumentException("Movie Name and Produced By cant be Null");
        }
        this.moviename=moviename;
        this.producedBy=producedBy;
        movieCount++;
    }

    public Movie(String moviename,String producedBy,String directedBy,double duration,int year,String category){
        this(moviename, producedBy);
        this.directedBy=directedBy;
        this.duration=duration;
        this.year=year;
        this.category=category;
//        this.movieCount=movieCount;
    }

    public void showDetails(){
        System.out.println("\n---MOVIE DETAILS--- \n"+"Movie ID: "+movieId+
                "\nMovie Name:"+moviename+"\n"+
                "Directed By :"+directedBy+"\n"+
                "Produced By :"+producedBy+"\n"+
                "Duration :"+duration+"\n"+
                "Release Year :"+year+"\n"+
                "category :"+category);
    }

    public String getMovieId(){
        movieId= moviename+"-00"+movieCount;
        return movieId;
    }
    public int getMovieCount(){
        return movieCount;
    }

}
