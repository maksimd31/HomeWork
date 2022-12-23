import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Human implements Serializable, interface01 {
    private String name, sex;
    private Integer Date;
    private Human father;

    private Human mother;

    private List<Human> children;

//Date Date = new Date();

//    public class Date {
//
//        private Date date1;
//        private Date date2;
//        private Date date3;
//
//    }

//    public Human(String name, int i, String human, String s) {
//        this.name = name;
//        this.children = new ArrayList<>();
////    Father.getChildren().add(this);
////    mother.getChildren().add(this);
//    }


    public Human(String name, int Date, String sex) { //конструктор класса имя и

        this.name = name;
        this.Date = Date;
        this.sex = sex;
        this.mother = null;
        this.father = null;
        this.children = new ArrayList<>();

//    public Human(String name, int Date, String sex, Human father, Human mother) { //конструктор класса имя и
//
//        this.name = name;
//        this.Date = Date;
//        this.sex = sex;
//        this.mother = mother;
//        this.father = father;
//        this.children = new ArrayList<>();


//     this.children = new ArrayList<>();
//        father.getChildren().add(this);
//        mother.getChildren().add(this);

    }


    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public Integer getYears() {
        return Date;
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

    @Override
    public void show() {
        System.out.println("Имя: " + getName() + " Возраст: " + getYears() + " Пол : " + getSex() + " Мать : " + mother + " " +
                " Отец : " + father);
    }


    public class MyClass {

        private Date d1;
        private Date d2;
        private String s;

    }

    //    ArrayList<MyClass> date  = new ArrayList<>();
    public void setYears(Integer Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYears() + " Пол : " + getSex() + " Мать : " + mother + " " +
                " Отец : " + father;
    }

    public static StringBuilder getNAME(Human[] Baza, String name) {
        StringBuilder result = new StringBuilder();
        for (Human c : Baza) {
            if (Objects.equals(c.name, name)) {
                result.append("Имя: ").append(c.name);
                result.append(" Возраст : ").append(c.Date);
                result.append(" пол : ").append(c.sex);
                result.append("\n");
            }
        }
        return result;
    }

}
