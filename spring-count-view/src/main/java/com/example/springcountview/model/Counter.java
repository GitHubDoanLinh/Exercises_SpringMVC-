package com.example.springcountview.model;

public class Counter {
    private int count;
    public Counter(){}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment(){
        count++;
    }

}
