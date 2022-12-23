import java.util.*;

public class Drevo {
    private List<Human> humans;


//    public Drevo(List<Human> humans) {
//        this.humans = humans;
//    }

    public Drevo() {
        this.humans = new ArrayList<>();

    }

    //метод добавления человека в дерево


    //метод поиска человека


    //метод вывода всех людей из дерева
    public void printDrevo(List<Human> humans) {
        System.out.println(humans);
    }

    public void setDrevo(List<Human> humans) {
        this.humans = humans;
    }

    public List<Human> getDrevo() {
        return this.humans;
    }


    public void addHuman(Human human, Human father, Human mother) {
        if (father != null) {
            human.setFather(father);
//            System.out.println("Как зовут вашего ребенка ?");
//            Scanner iScanner = new Scanner(System.in);
//            String VV = iScanner.nextLine();
//            if(VV == Human.){


//            this.drevo.add(human);
        }
        if (mother != null) {
            human.setMother(mother);
//            mother.getChildren().add(human);

        }
    }

    public void addChildren(Human human, Human father, Human mother) {
        if (father != null) {
            father.getChildren().add(human);
        }
        if (mother != null) {
            mother.getChildren().add(human);


        }
    }
}
