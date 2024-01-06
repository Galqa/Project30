package task3;

/* Використовуючи роботу з файлами, вивести не весь вміст XML-документа, а тільки те, що розташоване всередині тегу.
 *  Підказка: використовуйте регулярні вирази.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Instead {
    public static void main(String[] args) {

        // Створюємо об'єкт файлу
        File file = new File("C:\\Users\\My comp\\IdeaProjects\\Lesson48\\src\\main\\java\\xml\\candy.xml");
        try (Scanner scanner = new Scanner(file)) {  // об'єкт сканера


            String regex = ">([^<]+)<"; // регулярний вираз


            while (scanner.hasNextLine()) { // Перебираємо рядки файлу


                String result = scanner.findInLine(regex); // Знаходимо співпадіння з регулярним виразом в рядку

                if (result != null) {

                    String content = result.trim(); // Отримуємо вміст між тегами
                    System.out.println(content);
                }
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}