package com.jontxu.gothamCityNews.data;

public class CityHall {
    private float resources;

    public CityHall(int resources) {
        this.resources = resources;
    }

    public void setResources(float resources) {
        this.resources = resources;
    }

    public float getResources() {
        return resources;
    }

    public float incrementAndGet(float incrementer){
        resources += incrementer;
        return resources;
    }
    public float decrementAndGet(float decrementer){
        resources -= decrementer;
        return resources;
    }
}
