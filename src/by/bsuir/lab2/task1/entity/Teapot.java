package by.bsuir.lab2.task1.entity;

import java.io.Serializable;

public class Teapot extends Applience implements Serializable {
    private int powerConsumption;
    private double capacity;
    private double weight;
    private String material;
    private double height;

    public Teapot(double price, int powerConsumption, double weight, double capacity, double height, String material) {
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.height = height;
        this.material = material;
    }

    public Teapot(String[] args) {
        this.price = Integer.parseInt(args[0]);
        this.powerConsumption = Integer.parseInt(args[1]);
        this.weight = Double.parseDouble(args[2]);
        this.capacity = Double.parseDouble(args[3]);
        this.height = Integer.parseInt(args[4]);
        this.material = args[5];
    }

    public Teapot(){
        this.price = 0;
        this.powerConsumption = 0;
        this.weight = 0;
        this.capacity = 0;
        this.height = 0;
        this.material = "";
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format(
                "Teapot:\n %s, Power consumption: %d, Weight: %f, Capacity: %f, Height: %f, Material: %s",
                super.toString(), this.powerConsumption, this.weight, this.capacity, this.height, this.material);
    }
}
