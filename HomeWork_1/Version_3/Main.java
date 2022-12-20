import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите нового человека из семьи: ");
        String[] human = iScanner.nextLine().split(" ");
        Child child = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
        Set <Child> children = new HashSet<>();
        children.add(child);
        Drevo drevo = new Drevo(children);

        // заносим людей в дерево
        System.out.println("Введите нового человека из семьи: ");
        human = iScanner.nextLine().split(" ");
        child = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
        drevo.addHuman(child);

        System.out.println("Введите нового человека из семьи: ");
        human = iScanner.nextLine().split(" ");
        child = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
        drevo.addHuman(child);
        
        System.out.println("Введите нового человека из семьи: ");
        human = iScanner.nextLine().split(" ");
        child = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
        drevo.addHuman(child);
        // выводим получившуюся коллекцию на экран
        drevo.printDrevo(drevo.getDrevo());
        // применяем метод поиска
        drevo.searchHuman(drevo.getDrevo());
    }
}
