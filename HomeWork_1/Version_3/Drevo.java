import java.util.Set;
import java.util.Scanner;

public class Drevo {
    private Set <Child> drevo;

    public Drevo(Set <Child> drevo) {
        this.drevo = drevo;
    }

    //метод добавления человека в дерево
    public void addHuman (Child human) {
        this.drevo.add(human);
    }
    //метод поиска человека
    public void searchHuman (Set <Child> drevo) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя человека для поиска: ");
        String human = iScanner.nextLine();
        for (Child child : drevo) {
            if(human.equals(child.getName())) {
                System.out.println(child);
                break;
            } else {
                System.out.println("Нет людей с таким именем.");
                break;
            }
        }
    }
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
