package by.bsuir.lab2.task1.entity;

public class Fridge extends Applience {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Fridge(int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height, int width, int price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
        this.setPrice(price);
    }

    public Fridge(){
        this.price = 0;
        this.powerConsumption = 0;
        this.weight = 0;
        this.freezerCapacity = 0;
        this.height = 0;
        this.width = 0;
        this.overallCapacity = 0;
    }

    public int getPowerConsumption(){ return this.powerConsumption; }

    public int getWeight() { return this.weight; }

    public int getFreezerCapacity() { return this.freezerCapacity; }

    public int getOverallCapacity() { return this.overallCapacity; }

    public int getHeight() { return this.height; }

    public int getWidth() { return this.width; }

    public void setPowerConsumption(int powerConsumption) { this.powerConsumption = powerConsumption; }

    public void setWeight(int weight) { this.weight = weight; }

    public void setHeight(int height) { this.height = height; }

    public void setFreezerCapacity(int freezerCapacity) { this.freezerCapacity = freezerCapacity; }

    public void setOverallCapacity(int overallCapacity) { this.overallCapacity = overallCapacity; }

    public void setWidth(int width) { this.width = width; }

    @Override
    public String toString() {
        return String.format(
                "Fridge:\n %s, Power consumption: %d, Weight: %d, Freeze capacity: %d, Height: %d, Overall capacity: %d",
                super.toString(), this.powerConsumption, this.weight, this.freezerCapacity, this.height, this.overallCapacity);
    }
}
