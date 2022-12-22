import java.util.Set;
import java.util.Scanner;

public class Drevo {
    private Set <Child> drevo;

    public Drevo(Set <Child> drevo) {
        this.drevo = drevo;
    }

    public Drevo() {

    }

    //метод добавления человека в дерево
    public void addHuman (Child human) {
        this.drevo.add(human);
    }
    //метод поиска человека

    //метод вывода всех людей из дерева
    public void printDrevo (Set <Child> drevo) {
        System.out.println(drevo);
    }

    public void setDrevo(Set<Child> drevo) {
        this.drevo = drevo;
    }

    public Set<Child> getDrevo() {
        return drevo;
    }

}
