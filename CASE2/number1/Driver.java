public class Driver {
    public static void main(String[] args){
    //Book objects created
    Book b1 = new Book("Raymond Bahana", "Superheroes are Real", 15.50, 1719);
    Book b2 = new Book("Nunung Nurul", "Falling in Love with Data Structures", 12.80, 1902);
    Book b3 = new Book("Ardimas Andi Purwita", "Secure My Network", 24.50, 2021);
    Book b4 = new Book("Jude Martinez", "Bakemonogatari", 9.50, 1996);

    Book b5 = new Book("Ida Bagus","The Young Doctor",900,1974);

    System.out.println(b1.getAuthor() +", "+ b1.getTitle()+", "+"$"+b1.getPrice()+", "+b1.getYear());
    System.out.println(b2.getAuthor() +", "+ b2.getTitle()+", "+"$"+b2.getPrice()+", "+b2.getYear());
    System.out.println(b3.getAuthor() +", "+ b3.getTitle()+", "+"$"+b3.getPrice()+", "+b3.getYear());
    System.out.println(b4.getAuthor() +", "+ b4.getTitle()+", "+"$"+b4.getPrice()+", "+b4.getYear());
    System.out.println(b5.getAuthor() +", "+ b5.getTitle()+", "+"$"+b5.getPrice()+", "+b5.getYear());
}
}
