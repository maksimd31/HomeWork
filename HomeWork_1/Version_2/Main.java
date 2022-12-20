import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human h11 = new Human("Миша");
        Human h22 = new Human("Ольга");

        Human h2 = new Human("Иван",22,"муж",h11,h22);
        Human h3 = new Human("Ольга",33,"жен",h11,h22);
        Human h4 = new Human("Аля",10,"жен",h2,h3);

        Human[] Baza = {h2,h3,h4};

        System.out.println(Arrays.toString(Baza));


//        Scanner iScanner = new Scanner(System.in);
//        int VV = iScanner.nextInt();
//        switch (VV){
//            case 1:
//                metod.getname1(Baza);
//                break;
//        }


//        List<Human> humans = new ArrayList<>();
//        Human p1 = new Human();

//
//        Human gg = new Human("ff",12,"wdd",); //не работает
//        Human gg1 = new Human("ff",12,"wdd" ); //не работает\


//        humans.add(gg);











//        Human human1 = new Human("Андрей", 40, "Мужской");


//        List<Human> human1 = new ArrayList<>();
//        human1.add((people) human1);
//        Scanner iScanner = new Scanner(System.in);
//
//        String people = iScanner.next();
//        String[] human = people.split(" ");
//        int name = Integer.parseInt(human[0]);
//
//
//
//




    }


//        Human addHuman = new Human("Андрей", 40, "Мужской", Human);
//
//        Cildren Cildern1 = new Cildren("Иван", 10, "Мужской", "Андрей");
//
//
//        Human[] Baza = new Human[]{human1, Cildern1};
//
//        System.out.println(Baza);
//        System.out.println(human1.getName());
//
//        System.out.print("По какому критерию будем искать : 1. По имени\nВвод: ");
//
//        Scanner iScanner = new Scanner(System.in);
//        int VV = iScanner.nextInt();
//        switch (VV) {
//            case 1:
//                Human.getname1(Baza); //Имя
//                break;
//
//        }
//        System.out.println("Для завершения работы нажмите ENTER ");
//    }
}
