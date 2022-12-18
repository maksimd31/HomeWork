import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Андрей", 40, "Мужской", "Олег");

        Cildren Cildern1 = new Cildren("Иван", 10, "Мужской", "Андрей");


        Human[] Baza = new Human[]{human1,Cildern1};

        System.out.println(Baza);
        System.out.println(human1.getName());

        System.out.print("По какому критерию будем искать : 1. По имени\nВвод: ");

        Scanner iScanner = new Scanner(System.in);
        int VV = iScanner.nextInt();
        switch (VV) {
            case 1:
                Human.getname1(Baza); //Имя
                break;

        }
        System.out.println("Для завершения работы нажмите ENTER ");
    }
}
