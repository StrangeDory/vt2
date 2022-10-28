package Main;

import by.bsuir.lab2.task1.dao.impl.DAOImplement;
import by.bsuir.lab2.task1.entity.*;
import java.util.ArrayList;

public class Main {

    public static void showAppliances(ArrayList<Applience> appliances) {
        for (Applience appliance : appliances) {
            System.out.println(appliance.toString());
        }
    }

    public static void findLowestPrice(ArrayList<Applience> appliances) {
        appliances.sort(new PriceComparator());
        System.out.println("\nThe lowest price: " + appliances.get(0).toString());
    }

    public static void findAllTeapots(ArrayList<Applience> appliances) {
        System.out.println("\nAll teapots:");
        ArrayList<Applience> teapots = new ArrayList<>();
        for (Applience appliance : appliances) {
            if (appliance.getClass() == Teapot.class)
                teapots.add(appliance);
        }
        showAppliances(teapots);
    }

    public static void main(String[] args) {
        DAOImplement dao = new DAOImplement();
        ArrayList<Applience> appliances = dao.getAppliance();
        showAppliances(appliances);
        findLowestPrice(appliances);
        findAllTeapots(appliances);
    }
}
