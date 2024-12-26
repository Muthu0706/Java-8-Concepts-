package com.advance.java;

import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Collectors;  
    
public class GFG {  
    
    public static void main(String[] args)  
    {  
    
        // The following statement filters  
        // cities having temp > 10  
        // The map function transforms only  
        // the names of the cities  
        // The collect function collects the  
        // output as a List  
        System.out.println(prepareTemperature().stream() 
                 .filter(f -> f.getTemperature() > 10) 
                 .map(f -> f.getName()) 
                 .collect(Collectors.toList()));  
    }  
    
    private static List<City> prepareTemperature() 
    { 
        List<City> cities = new ArrayList<>(); 
        cities.add(new City("New Delhi", 33.5)); 
        cities.add(new City("Mexico", 14)); 
        cities.add(new City("New York", 13)); 
        cities.add(new City("Dubai", 43)); 
        cities.add(new City("London", 15)); 
        cities.add(new City("Alaska", 1)); 
        cities.add(new City("Kolkata", 30)); 
        cities.add(new City("Sydney", 11)); 
        cities.add(new City("Mexico", 14)); 
        cities.add(new City("Dubai", 43)); 
        return cities; 
    } 

}  
