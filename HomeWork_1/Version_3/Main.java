import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args ) {
        Human FF = new Human("Boby", 3,"men");
        Human F1 = new Human("Alex",2,"men");

        Drevo fam = new Drevo();
        fam.addHuman(new Human("Boby",22 ,"man"),F1, null );

        Drevo  Cill = new Drevo();
        Cill.addChildren(FF,F1,null);





/*
не понимаю как сделать с сканером

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите нового человека из семьи: ");
        String[] human = iScanner.nextLine().split(" ");

        Human human1 = new Human(Drevo.addHuman(human[0],human[1],human[2])); метод addHuman не работает, хотя должен
//        Human human1 = new Human(human[0], Integer.parseInt(human[1]), human[2],(human[3]),(human[4]));
        Set<Human> human111 = new HashSet<>();
        human111.add((Human) human1);
        Drevo drevo = new Drevo();
*/



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

        Drevo humans = new Drevo();
        // выводим получившуюся коллекцию на экран
        humans.printDrevo(humans.getDrevo());
        // применяем метод поиска
        Main.searchHuman(humans.getDrevo());
    }

    public static void searchHuman(List<Human> humans) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя человека для поиска: ");
        String human = iScanner.nextLine();
        for (Human Human : humans) {
            if (human.equals(Human.getName())) {
                System.out.println(Human);
                break;
            } else {
                System.out.println("Нет людей с таким именем.");
                break;
            }
        }
    }


}
