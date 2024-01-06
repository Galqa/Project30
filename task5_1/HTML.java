package task5_1;


import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;


public class HTML {
    public static void main(String[] args) throws TransformerException {
        Source xmlSource = new StreamSource(new File("C:\\Users\\My comp\\IdeaProjects\\Lesson48\\src\\main\\java\\xml\\candy.xml"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        StreamResult htmlResult = new StreamResult(new File("file.html"));
        transformer.transform(xmlSource, htmlResult);
    }
}