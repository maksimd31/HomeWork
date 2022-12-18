/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека и модель семейного дерева для хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
У дерева обязательно реализовать метод добавления нового человека в семейное дерево, поиск человека по имени и вывод всех людей из дерева.
У человека можно реализовать методы вывода всех сестер или всех детей.
Проект сдать либо в виде репозитория либо в виде PullRequest к проекту: https://github.com/Liberate520/homeWork
Если делаете PR, то в качестве ответа укажите ссылку на конкретный PR
Инструкция на то как сделать PR https://youtu.be/veMDnBt30pk
По вопросам домашки писать @Liberate520
Обязательно пробуем свои силы, в дальнейшем будем этот проект развивать
 */

import java.util.ArrayList;
import java.util.List;

public class BaseHuman { //Родительский класс
    String name, sex;
    Integer yers;
    String Father;
    List<BaseHuman> cildren;


//    protected static int yers;
//    protected static String name;
//    protected static String sex;
//
//    protected static String Father;


    public BaseHuman(String name, int yers, String sex, String Father) { //конструктор класса имя и возраст
        this.name = name;
        this.yers = yers;
        this.sex = sex;
        this.Father = Father;
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
        return "Имя: " + name + " Возраст: " + yers + " Пол : "+ sex +  "Родство: " + Father;
    }
}

