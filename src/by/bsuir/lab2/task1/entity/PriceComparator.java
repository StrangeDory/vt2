package by.bsuir.lab2.task1.entity;

import java.util.Comparator;

public class PriceComparator implements Comparator<Applience> {

    @Override
    public int compare(Applience o1, Applience o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }

}
