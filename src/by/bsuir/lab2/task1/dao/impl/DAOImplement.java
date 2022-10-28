package by.bsuir.lab2.task1.dao.impl;

import by.bsuir.lab2.task1.dao.IDAOApplience;

import java.io.IOException;
import java.util.ArrayList;

import by.bsuir.lab2.task1.entity.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DAOImplement implements IDAOApplience {
    private static final String DATABASE_PATH = "ApplianceList.xml";

    private Document doc;

    //получить из xml список бытовой техники
    public ArrayList<Applience> getAppliance() {
        ArrayList<Applience> appliances = new ArrayList<>();
        ArrayList<ArrayList<String>> fields = find("Laptop");
        for (ArrayList<String> field : fields) {
            Laptop laptop = new Laptop(field.toArray(new String[0]));
            appliances.add(laptop);
        }
        fields = find("MobilePhone");
        for (ArrayList<String> field : fields) {
            MobilePhone phone = new MobilePhone(field.toArray(new String[0]));
            appliances.add(phone);
        }
        fields = find("Fridge");
        for (ArrayList<String> field : fields) {
            Fridge fridge = new Fridge(field.toArray(new String[0]));
            appliances.add(fridge);
        }
        fields = find("Teapot");
        for (ArrayList<String> field : fields) {
            Teapot teapot = new Teapot(field.toArray(new String[0]));
            appliances.add(teapot);
        }
        return appliances;
    }

    //получить из xml список определённого вида техники
    public ArrayList<ArrayList<String>> find(String groupName) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(DATABASE_PATH);

            ArrayList<ArrayList<String>> objectsInformation = new ArrayList<>();
            NodeList elementList = doc.getElementsByTagName(groupName);
            for (int i = 0; i < elementList.getLength(); i++) {
                Node p = elementList.item(i);
                if (p.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) p;
                    NodeList nameList = element.getChildNodes();
                    ArrayList<String> currentObjectInfo = new ArrayList<>();
                    for (int j = 0; j < nameList.getLength(); j++) {
                        Node n = nameList.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;
                            currentObjectInfo.add(name.getTextContent());
                        }
                    }
                    objectsInformation.add(currentObjectInfo);
                }
            }

            return objectsInformation;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
