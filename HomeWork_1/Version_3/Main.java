import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Human> date  = new ArrayList<>(Human.MyClass);

        Human h11 = new Human("Миша");
        Human h22 = new Human("Ольга");

        Human h2 = new Human("Иван",22,"муж",h11,h22);
        Human h3 = new Human("Ольга",33,"жен",h11,h22);
        Human h4 = new Human("Аля",10,"жен",h2,h3);

        Human[] Baza = {h2,h3,h4};

//
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите нового человека из семьи: ");
//        String[] human = iScanner.nextLine().split(" ");

        Drevo drevo = new Drevo();



//        Human human1 = new Human(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
//        Set <Child> children = new HashSet<>();
//        children.add((Child) human1);
//
//
//        // заносим людей в дерево
//        System.out.println("Введите нового человека из семьи: ");
//        human = iScanner.nextLine().split(" ");
//        human1 = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
//        drevo.addHuman(human1);
//
//        System.out.println("Введите нового человека из семьи: ");
//        human = iScanner.nextLine().split(" ");
////        human1 = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
//        drevo.addHuman(human);
//
//        System.out.println("Введите нового человека из семьи: ");
//        human = iScanner.nextLine().split(" ");
//        human1 = new Child(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
//        drevo.addHuman(human1);


        // выводим получившуюся коллекцию на экран
        drevo.printDrevo(drevo.getDrevo());
        // применяем метод поиска
        Main.searchHuman(drevo.getDrevo());
    }
    public static void searchHuman(Set<Child> drevo) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя человека для поиска: ");
        String human = iScanner.nextLine();
        for (Child child : drevo) {
            if(human.equals(child.getName())) {
                System.out.println(child);
                break;
            } else {
                System.out.println("Нет людей с таким именем.");
                break;
            }
        }
    }
}
