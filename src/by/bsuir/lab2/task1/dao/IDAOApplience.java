package by.bsuir.lab2.task1.dao;

import by.bsuir.lab2.task1.entity.Applience;

import java.util.ArrayList;

public interface IDAOApplience {
    ArrayList<Applience> getAppliance();

    ArrayList<ArrayList<String>> find(String groupName);
}
