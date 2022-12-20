
import java.util.Objects;

public class Human {
    private String name, sex;
    private Integer years;

    public Human(String name, int years, String sex) { //конструктор класса имя и возраст, пол
        this.name = name;
        this.years = years;
        this.sex = sex;
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

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