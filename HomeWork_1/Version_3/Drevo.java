import java.util.Set;

public class Drevo {
    private Set <human11> drevo;

    public Drevo(Set <human11> drevo) {
        this.drevo = drevo;
    }

    public Drevo() {

    }

    //метод добавления человека в дерево
    public void addHuman (human11 human) {
        this.drevo.add(human);
    }
    //метод поиска человека

    //метод вывода всех людей из дерева
    public void printDrevo (Set <human11> drevo) {
        System.out.println(drevo);
    }

    public void setDrevo(Set<human11> drevo) {
        this.drevo = drevo;
    }

    public Set<human11> getDrevo() {
        return drevo;
    }

}
