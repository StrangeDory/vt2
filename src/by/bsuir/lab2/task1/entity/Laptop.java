package by.bsuir.lab2.task1.entity;

public class Laptop extends Applience{

    private String operatingSystem;
    private int memorySize;
    private double weight;
    private double width;
    private double height;
    private double thickness;
    private String material;
    private int energyReserve;

    public Laptop(double price, double weight, double height, double width, double thickness, String material, int energyReserve, String operatingSystem, int memorySize) {
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.material = material;
        this.operatingSystem = operatingSystem;
        this.memorySize = memorySize;
        this.width = width;
        this.thickness = thickness;
        this.energyReserve = energyReserve;
    }

    public Laptop(String[] args) {
        this.price = Integer.parseInt(args[0]);
        this.weight = Double.parseDouble(args[1]);
        this.height = Integer.parseInt(args[2]);
        this.width = Double.parseDouble(args[3]);
        this.thickness = Double.parseDouble(args[4]);
        this.material = args[5];
        this.energyReserve = Integer.parseInt(args[6]);
        this.operatingSystem = args[7];
        this.memorySize = Integer.parseInt(args[8]);
    }

    public Laptop(){
        this.price = 0;
        this.weight = 0;
        this.height = 0;
        this.material = "";
        this.operatingSystem = "";
        this.memorySize = 0;
        this.width = 0;
        this.thickness = 0;
        this.energyReserve = 0;
    }

    public int getEnergyReserve() {return this.energyReserve;}

    public void setEnergyReserve(int energyReserve) {this.energyReserve = energyReserve;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public String getMaterial() {return material;}

    public void setMaterial(String material) {this.material = material;}

    public double getWidth() {return this.width;}

    public void setWidth(double width) {this.width = width;}

    public double getThickness() {return this.thickness;}

    public void setThickness(double thickness) {this.thickness = thickness;}

    public String getOperatingSystem() {return this.operatingSystem;}

    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

    public int getMemorySize() {return this.memorySize;}

    public void setMemorySize(int memorySize) {this.memorySize = memorySize;}

    @Override
    public String toString() {
        return String.format(
                "Laptop:\n %s, Operating system: %s, Memory size: %d, Energy reserve: %d, Weight: %f, Width: %f, Height: %f, Thickness: %f, Material: %s",
                super.toString(), this.operatingSystem, this.memorySize, this.energyReserve, this.weight, this.width, this.height, this.thickness, this.material);
    }
}
