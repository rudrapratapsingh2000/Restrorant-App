package com.Restaurant.Restro.service;

import com.Restaurant.Restro.Model.RestaurantModelClass;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestoService {
    private static List<RestaurantModelClass> restos = new ArrayList<>();
    static {
        restos.add(new RestaurantModelClass("Ramada","Bangolore",1001,"5 star",200));
        restos.add(new RestaurantModelClass("Crown Plaza","Noida",1002,"4.3 star",160));
        restos.add(new RestaurantModelClass("Haveli Resort","Jaipur",1003,"5 star",200));
        restos.add(new RestaurantModelClass("DK Palace","Lucknow",1004,"3 star",150));
        restos.add(new RestaurantModelClass("Leo's Pizzeria","Delhi",1005,"7 star",350));
    }

    // add Restaurant in the List
    public void addRestaurant(RestaurantModelClass resto){
        restos.add(resto);
    }

    //find all restaurant in the List
    public List<RestaurantModelClass> findAllRestaurant(){ return restos; }

    // find Restaurant by Name
    public RestaurantModelClass findByName( String name){
        Predicate<? super RestaurantModelClass> predicate = rest -> rest.getResto_name().equals(name);
        RestaurantModelClass rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    // find Restaurant by Number
    public RestaurantModelClass findByNumber( int number){
        Predicate<? super RestaurantModelClass> predicate = rest -> rest.getResto_number()==number;
        RestaurantModelClass rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    //number work as restaurant id and delete it.
    public void deleteRestaurant(int number){
        Predicate<? super RestaurantModelClass> predicate=rest ->rest.getResto_number()==number;
        restos.removeIf(predicate);
    }

    //Update Restaurant Information
    public void updateRestaurant(int number, RestaurantModelClass newrest){
        RestaurantModelClass rest=findByNumber(number);
        rest.setResto_name(newrest.getResto_name());
        rest.setResto_address(newrest.getResto_address());
        rest.setResto_number(newrest.getResto_number());
        rest.setResto_speciality(newrest.getResto_speciality());
        rest.setResto_totalstaff(newrest.getResto_totalstaff());
    }
}
