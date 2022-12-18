import java.util.ArrayList;
import java.util.List;

public class Drevo {

    public void addHuman(){
        List<Human> Human1 = new ArrayList<>(); //создаем лист и записываем всех туда //взрослые
        Human V1 = new Human("Андрей", 40, "Мужской", null);

        System.out.println(V1);
//         Human addHuman = new Human("Андрей", 40, "Мужской", Human);
    }
}


//Дерево рассматривается как коллекция для людей
//
//Должно обладать соответствующими методами, добавление или получения элементов