public class Id implements interface01 {
    public int id;



    public Id(int id){
        this.id = id;

    }

    public void IDD(){
        System.out.println("Теперь у людей есть id");
    }

    @Override
    public void show() {
        System.out.println("id" + this.id); //выводит id в интерфейс

    }
}
