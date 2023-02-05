package com.Restaurant.Restro.cotroller;

import com.Restaurant.Restro.Model.RestaurantModelClass;
import com.Restaurant.Restro.service.RestoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resto-app")
public class RestoControler {
    private final RestoService restoService;
    public RestoControler(RestoService restoService){
        this.restoService=restoService;
    }

//http://localhost:8080/api/resto-app/add-restaurant
    /*
    JSON FORMAT-:
    {
        "resto_name": "Holidays Restaurant",
        "resto_address": "Gurgoan",
        "resto_number": 1006,
        "resto_speciality": "7 star",
        "resto_totalstaff": 400
    }
     */
    @PostMapping("/add-restaurant")
    public void addResto(@RequestBody RestaurantModelClass restaurantModelClass){
        restoService.addRestaurant(restaurantModelClass);
    }


    //http://localhost:8080/api/resto-app/find-restaurant/name/{name}
    //http://localhost:8080/api/resto-app/find-restaurant/name/Ramada
    @GetMapping("/find-restaurant/name/{name}")
    public RestaurantModelClass findRestaurantByName(@PathVariable String name){
        return restoService.findByName(name);
    }


    //http://localhost:8080/api/resto-app/findall-restaurant
    @GetMapping("/findall-restaurant")
    public List<RestaurantModelClass> findAllRestos(){
       return restoService.findAllRestaurant();
    }


    //http://localhost:8080/api/resto-app/update-restaurant/number/{number}
    /*
    http://localhost:8080/api/resto-app/update-restaurant/number/1001
    JSON FORMAT-:
     {
        "resto_name": "Dream Restaurant",
        "resto_address": "Bangolore",
        "resto_number": 1001,
        "resto_speciality": "5 star",
        "resto_totalstaff": 200
    }
     */
    @PutMapping("/update-restaurant/number/{number}")
    public void updateRestaurant(@PathVariable int number,@RequestBody RestaurantModelClass restaurantModelClass){
       restoService.updateRestaurant(number,restaurantModelClass);
    }


    //http://localhost:8080/api/resto-app/delete-restaurant/number/{number}
    //http://localhost:8080/api/resto-app/delete-restaurant/number/1001
    @DeleteMapping("/delete-restaurant/number/{number}")
    public void deleteRestaurant(@PathVariable int number){
        restoService.deleteRestaurant(number);
    }
}
