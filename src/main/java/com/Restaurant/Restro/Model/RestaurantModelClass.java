package com.Restaurant.Restro.Model;

public class RestaurantModelClass {
    private String resto_name;
    private String resto_address;
    private int resto_number;
    private String resto_speciality;
    private int resto_totalstaff;

    public RestaurantModelClass() {
    }

    public RestaurantModelClass(String resto_name, String resto_address, int resto_number, String resto_speciality, int resto_totalstaff) {
        this.resto_name = resto_name;
        this.resto_address = resto_address;
        this.resto_number = resto_number;
        this.resto_speciality = resto_speciality;
        this.resto_totalstaff = resto_totalstaff;
    }

    public String getResto_name() {
        return resto_name;
    }

    public void setResto_name(String resto_name) {
        this.resto_name = resto_name;
    }

    public String getResto_address() {
        return resto_address;
    }

    public void setResto_address(String resto_address) {
        this.resto_address = resto_address;
    }

    public int getResto_number() {
        return resto_number;
    }

    public void setResto_number(int resto_number) {
        this.resto_number = resto_number;
    }

    public String getResto_speciality() {
        return resto_speciality;
    }

    public void setResto_speciality(String resto_speciality) {
        this.resto_speciality = resto_speciality;
    }

    public int getResto_totalstaff() {
        return resto_totalstaff;
    }

    public void setResto_totalstaff(int resto_totalstaff) {
        this.resto_totalstaff = resto_totalstaff;
    }

    @Override
    public String toString() {
        return "RestaurantModelClass{" +
                "resto_name='" + resto_name + '\'' +
                ", resto_address='" + resto_address + '\'' +
                ", resto_number=" + resto_number +
                ", resto_speciality='" + resto_speciality + '\'' +
                ", resto_totalstaff=" + resto_totalstaff +
                '}';
    }
}
