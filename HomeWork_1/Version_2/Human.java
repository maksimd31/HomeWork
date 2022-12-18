import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Human {
    private String name, sex;
    private Integer yers;
    private Human Father;
    private List<Human> children;

    public Human(String name, int yers, String sex,Human Father) { //конструктор класса имя и возраст
        this.name = name;
        this.yers = yers;
        this.sex = sex;
        this.Father = Father;
        this.children = new ArrayList<>();
        Father.getChildren().add(this);


    }
    public Human(String name,Human Father){
        this.name = name;
        this.yers = yers;
        this.sex = sex;
        this.Father = Father;
        this.children = new ArrayList<>();
        Father.getChildren().add(this);
    }
    public List<Human> getChildren() {
        return this.children;
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



    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYers() + " Пол : " + getSex();
    }

    public static StringBuilder getNAME(Human[] Baza, String name) {
        StringBuilder result = new StringBuilder();
        for (Human c : Baza) {
            if (Objects.equals(c.name, name)) {
                result.append("Имя: ").append(c.name);
                result.append(" Возраст : ").append(c.yers);
                result.append(" пол : ").append(c.sex);
                result.append("\n");
            }
        }
        return result;
    }

    public static void getname1(Human[] Baza) { // фильтр бренда
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