package Number2;

public class Monkey implements Animal{
    private String name;
    private int weight;
    private String food;

    public Monkey(String name, int weight, String food) {
        this.name = name;
        this.weight = weight;
        this.food = food;
    }
    public String toString() {
        return this.name + " is a monkey. He weighs " + this.weight + " pounds and loves " + this.food + ".";
    }
}
