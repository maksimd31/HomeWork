import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
Описываем сущность вида human
 */
public class Designer_Human implements Serializable{
    //создаем поля в классе
    private String name, sex;
    private int date;

    private Designer_Human father; // Объектная переменная

    private Designer_Human mother; // Объектная переменная

    private List<Designer_Human> children;

    private List<Designer_Human> humans;

    public Designer_Human(List<Designer_Human> humans){
        this.humans =humans;
    }
    public Designer_Human(){
        this(new ArrayList<>());
    }

    /**
     * Создаем максимально описанный конструктор
     *
     * @param name
     * @param sex
     * @param date
     * @param father
     * @param mother
//     * @param humans
     */
    public Designer_Human(String name, String sex, int date, Designer_Human father, Designer_Human mother) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.father = father;
        this.mother = mother;
//        this.humans = humans;
        this.children = new ArrayList<>();

    }

    /**
     * Создаем конструктор на случей отсутствия родителей.
     * @param name
     * @param sex
     * @param date
     */
    public Designer_Human(String name, String sex, int date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

   /**
   Создаем геторы и сетеры
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

//    public void setSex(String sex) {
//        this.sex = sex;
//    }

    public int getDate() {
        return date;
    }

//    public void setDate(int date) {
//        this.date = date;
//    }
//
//    public Designer_Human getFather() {
//        return father;
//    }

    public void setFather(Designer_Human father) {
        this.father = father;
    }

//    public Designer_Human getMother() {
//        return mother;
//    }

    public void setMother(Designer_Human mother) {
        this.mother = mother;
    }

    public List<Designer_Human> getChildren() {
        return children;
    }

//    public void setChildren(List<Designer_Human> children) {
//        this.children = children;
//    }

    /**
     * Вариант добавления детей
     * @return Возвращает список с параметрами toString
     */
    public String AddChildren() { // добавляем детей другим методом
        StringBuilder Child = new StringBuilder();
        if (this.children != null) {
            Child.append(getName());
            for (Designer_Human c : getChildren()) {
                Child.append(c.getName());
            }
        } else {
            Child.append("null");
        }
        return Child.toString();
    }

    /**
     * Вариант добавления людей
     * @param name
     * @param sex
     * @param date
     */
    public void AddHuman(String name, String sex, int date){
        Designer_Human HH = new Designer_Human(name,sex,date);
        this.humans.add(HH);
    }

    /**
     * Переопределение toString
     *
     * @return Делаем перегрузку
     */
    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getDate() + " Пол : " + getSex() + " Мать : " + mother + " " +
                " Отец : " + father;
    }
}

