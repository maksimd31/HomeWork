import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Human FF = new Human("Boby", 3, "men");
        Human F1 = new Human("Alex", 2, "men");
        FF.show(); // вызов из интерфейса

        //Второй метод вызова из interface01
        interface01 TT = new Human("Bady", 33, "man");
        interface01 T1 = new Id(1);
        TT.show();
        T1.show();
        //+ - Полиморфизм
        //еще один метод вывода ниже ouputinterface01(interface01 info)
        ouputinterface01(TT);
        ouputinterface01(T1);

        Drevo fam = new Drevo();
        fam.addHuman(new Human("Boby", 22, "man"), F1, null);

        Drevo Cill = new Drevo();
        Cill.addChildren(FF, F1, null);


////        Сериализация [запись объектов в файл]
        try {
            FileOutputStream fos = new FileOutputStream("Human.txt"); //создаем файл с бинарными файлами
            ObjectOutputStream oos = new ObjectOutputStream(fos); // Записавает последовательность байтов в файл

            oos.writeObject(FF);
            oos.writeObject(F1); //Записываем в файл

            oos.close(); //Всегда нужно закрывать

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //если такого файла не существует мы записываем исключение
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Drevo humans = new Drevo();
        // выводим получившуюся коллекцию на экран
        humans.printDrevo(humans.getDrevo());
        // применяем метод поиска
        Main.searchHuman(humans.getDrevo());
    }

    public static void ouputinterface01(interface01 info) { //Метод интерфейса
        info.show();
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
