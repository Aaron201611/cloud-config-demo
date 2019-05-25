package com.example.shopinfoservice.model;

public class Shop {

    private String id;

    private String name;

    private Integer years;

    public Shop(){

    }
    public Shop(String id, String name, Integer years) {
        this.id = id;
        this.name = name;
        this.years = years;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
