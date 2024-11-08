package com.example.healthyrecipesapp;

public class Cook {
    private String name;
    private String ingredients;
    private String method;
    private String type;
    private String photo;

    public Cook(String photo, String type, String name, String ingredients, String method) {
        this.name = name;
        this.ingredients = ingredients;
        this.method = method;
        this.type = type;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getMethod() {
        return method;
    }

    public String getType() {
        return type;
    }

    public String getPhoto() {
        return photo;
    }
}
