package dom;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class DOMParser {

    public static void main(String[] args) {
        try {
            // створюємо об'єкт DocumentBuilder для аналізу XML-документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // читаємо XML-документ з файлу
            File inputFile = new File("C:\\Users\\My comp\\IdeaProjects\\Lesson48\\src\\main\\java\\task2\\candy.xml");
            Document doc = builder.parse(inputFile);

            // отримуємо кореневий елемент XML-документа
            Element root = doc.getDocumentElement();
            System.out.println("Кореневий елемент: " + root.getNodeName());

            // отримуємо список всіх елементів <Name>
            NodeList nameList = root.getElementsByTagName("Name");
            System.out.println("Кількість елементів <Name>: " + nameList.getLength());

            // перебираємо всі елементи <Name> і виводимо їх текстове значення
            for (int i = 0; i < nameList.getLength(); i++) {
                Node nameNode = nameList.item(i);
                System.out.println("Назва цукерки: " + nameNode.getTextContent());
            }

            // отримуємо список всіх елементів <Energy>
            NodeList energyList = root.getElementsByTagName("Energy");
            System.out.println("Кількість елементів <Energy>: " + energyList.getLength());

            // перебираємо всі елементи <Energy> і виводимо їх текстове значення
            for (int i = 0; i < energyList.getLength(); i++) {
                Node energyNode = energyList.item(i);
                System.out.println("Енергетична цінність цукерки: " + energyNode.getTextContent());
            }

            // отримуємо список всіх елементів <Production>
            NodeList productionList = root.getElementsByTagName("Production");
            System.out.println("Кількість елементів <Production>: " + productionList.getLength());

            // перебираємо всі елементи <Production> і виводимо їх текстове значення
            for (int i = 0; i < productionList.getLength(); i++) {
                Node productionNode = productionList.item(i);
                System.out.println("Виробник цукерки: " + productionNode.getTextContent());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
