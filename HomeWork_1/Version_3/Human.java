
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Human {
    private String name, sex;
    private Integer years;
    private Human father;

    private Human mother;
    private List<Human> children;

    public Human(String name){
        this.name = name;
        this.children = new ArrayList<>();
//    Father.getChildren().add(this);
//    mother.getChildren().add(this);


    }





    public Human(String name, int date, String sex, Human father, Human mother) { //конструктор класса имя и

        this.name = name;
        this.years = date;
        this.sex = sex;
        this.mother = mother;
        this.father = father;

        this.children = new ArrayList<>();
        father.getChildren().add(this);
        mother.getChildren().add(this);

    }

    public String getName() {
        return name;
    }

    public Integer getYears() {
        return years;
    }

    public String getSex() {
        return sex;

    }
    public List<Human> getChildren() {
        return this.children;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public class MyClass {

        private Date d1;
        private Date d2;
        private String s;

    }
    //    ArrayList<MyClass> date  = new ArrayList<>();
    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYears() + " Пол : " + getSex();
    }

    public static StringBuilder getNAME(Human[] Baza, String name) {
        StringBuilder result = new StringBuilder();
        for (Human c : Baza) {
            if (Objects.equals(c.name, name)) {
                result.append("Имя: ").append(c.name);
                result.append(" Возраст : ").append(c.years);
                result.append(" пол : ").append(c.sex);
                result.append("\n");
            }
        }
        return result;
    }

}
/*
Посмотрел третий вариант. Класс Child убрать. Везде, где он использовался в коде заменить на Human.

Возраст для описания гениалогического древа плохо подходит, лучше дата рождения.

В дереве вынести из методов работу со сканерами.
Метод должна поступать информация для работы и не важно откуда она придет.
Работу со сканнером можно вынести в отдельный класс, можно пока оставить в классе Main
 */