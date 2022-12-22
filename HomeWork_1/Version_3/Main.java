import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите нового человека из семьи: ");
        String[] human = iScanner.nextLine().split(" ");

//        Human human1 = new human11(human[0], Integer.parseInt(human[1]) , human[2], human[0], human[4]);
        Human human1 = new Human(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
        Set <human11> human111 = new HashSet<>();
        human111.add((human11) human1);
        Drevo drevo = new Drevo(human111);



//        List<Human> date  = new ArrayList<>(Human.MyClass);

//        Human h11 = new Human("Миша");
//        Human h22 = new Human("Ольга");
//
//        Human h2 = new Human("Иван",22,"муж",h11,h22);
//        Human h3 = new Human("Ольга",33,"жен",h11,h22);
//        Human h4 = new Human("Аля",10,"жен",h2,h3);
//
//        Human[] Baza = {h2,h3,h4};

//
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите нового человека из семьи: ");
//        String[] human = iScanner.nextLine().split(" ");




//        Human human1 = new Human(human[0], Integer.parseInt(human[1]) , human[2], human[3]);
//        Set <Child> human111 = new HashSet<>();
//        human111.add((Child) human1);
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
    public static void searchHuman(Set<human11> drevo) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя человека для поиска: ");
        String human = iScanner.nextLine();
        for (human11 human11 : drevo) {
            if(human.equals(human11.getName())) {
                System.out.println(human11);
                break;
            } else {
                System.out.println("Нет людей с таким именем.");
                break;
            }
        }
    }
}
