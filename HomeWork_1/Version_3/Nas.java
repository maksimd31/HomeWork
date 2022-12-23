public class Nas extends Human implements interface01{
    //Вызов интрефейса не смог сделать на класс human там уже есть implements поэтому создал класс наследования Nas
    //Ну потом я прочитал что можно испрользвать мого раз implements

    public Nas(String name, int Date, String sex) {
        super(name, Date, sex);

    }



    @Override
    public void show() {
        System.out.println("Человек " + this.getName());
    }
} //медоды для interface
////
////    @Override // метод добавления
////    public class getsave(){
////
//}
