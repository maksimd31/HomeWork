public class Child extends Human {
    private String kinship;

    public Child(String name, int years, String sex, String kinship) {
        super(name, years, sex);
        this.kinship = kinship;
    }

    public String getKinship() {
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getYears() + " Пол : " + getSex() + " Родство: " + getKinship();
    }
}
