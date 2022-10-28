package Main;

import by.bsuir.lab2.task1.entity.*;

import java.util.ArrayList;

public class Main {

    public static void showAppliances(ArrayList<Applience> appliances) {
        System.out.println("\nAll teapots:");
        for (Applience appliance : appliances) {
            System.out.println(appliance.toString());
        }
    }

    public static void findLowestPrice(ArrayList<Applience> appliances) {
        appliances.sort(new PriceComparator());
        System.out.println("\nThe lowest price: " + appliances.get(0).toString());
    }

    public static void findAllTeapots(ArrayList<Applience> appliances) {
        ArrayList<Applience> teapots = new ArrayList<>();
        for (Applience appliance : appliances) {
            if (appliance.getClass() == Teapot.class)
                teapots.add(appliance);
        }
        showAppliances(teapots);
    }

    public static void main(String[] args) {
        ArrayList<Applience> appliances = new ArrayList<>();
        appliances.add(new Teapot(85, 90, 1.2, 1.8, 30, "plastic"));
        appliances.add(new Teapot(55, 60, 0.8, 0.8, 20, "plastic"));
        appliances.add(new Fridge(221, 38, 20, 80, 170, 80, 350));
        appliances.add(new Laptop(1565, 2.2, 35, 50, 2, "plastic", 148, "Windows", 1000));
        appliances.add(new MobilePhone(1039, 0.8, 15, 7, 0.2, "metal", "Android", 128));

        showAppliances(appliances);
        findLowestPrice(appliances);
        findAllTeapots(appliances);
    }
}
