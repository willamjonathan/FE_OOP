public class Book {

    //prvate variables
    private String author;
    private String title;
    private double price;
    private int year;
    //public method
    //constructors

    public Book(String author, String title, double price, int year){
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    
    }
    //getter and setter methods
    
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return this.author + ", " + this.title + ", $" + this.price + ", " + this.year;
    }
}

