public class Snake implements Animal{
    private String name;
    private int weight;
    private int length;

    public Snake(String name, int weight, int length) {
        this.name = name;
        this.weight = weight;
        this.length = length;
    }
    public String toString() {
        return this.name+", the snake, weighs "+ this.weight+" pounds and it is "+ this.length
        +" feet long.";
    }
}
