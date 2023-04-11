package com.example.intromaven.model;

public class Ingredient {
    private String name;
    private int count;
    private String measureUnit;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getMeasureUnit() {
        return measureUnit;
    }
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }
}