import java.util.Objects;
import java.util.Scanner;

public class Human {
    String name, sex;
    Integer yers;
    String Father;

    public Human(String name, int yers, String sex, String Father) { //конструктор класса имя и возраст
        this.name = name;
        this.yers = yers;
        this.sex = sex;
        this.Father = Father;

    }

    public String getName() { //возращение
        return name;
    }

    public Integer getYers() {
        return yers;
    }

    public String getSex() { //возращение
        return sex;

    }
    public String getFather(){
        return Father;
    }


    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYers() + " Пол : " + getSex() + "Родство: " + getFather();
    }

    public static StringBuilder getNAME(Human[] Baza, String name) {
        StringBuilder result = new StringBuilder();
        for (Human c : Baza) {
            if (Objects.equals(c.name, name)) {
                result.append("Имя: ").append(c.name);
                result.append(" Возраст : ").append(c.yers);
                result.append(" пол : ").append(c.sex);
                result.append(" Родство : ").append(c.Father);
                result.append("\n");
            }
        }
        return result;
    }
    public static void getname1 (Human[] Baza) { // фильтр бренда
        System.out.println("Введите имя");
        while (true) {
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Андрей")) {
                System.out.print(Human.getNAME(Baza, "Андрей"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }


}


