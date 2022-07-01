package Number2;

public class Lion implements Animal {
    private String name;
    private int weight;
    private int meat;

    public Lion(String name, int weight, int meat) {
        this.name = name;
        this.weight = weight;
        this.meat = meat;
    }
     public String toString() {
        return this.name + " weighs " + this.weight + " pounds and consumes " + this.meat + " pounds of meat everyday";
    }
}
