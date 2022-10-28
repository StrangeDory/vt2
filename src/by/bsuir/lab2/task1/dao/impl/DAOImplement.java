package by.bsuir.lab2.task1.dao.impl;

import by.bsuir.lab2.task1.dao.IDAOApplience;

import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DAOImplement implements IDAOApplience {
    private static final String DATABASE_PATH = "ApplianceList.xml";

    private Document doc;

    public ArrayList<ArrayList<String>> find(String groupName) {

        return null;
    }
}
