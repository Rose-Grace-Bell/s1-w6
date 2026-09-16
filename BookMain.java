public class BookMain {
    public static void main(String[] args) {
        Book b = new Book("man");
        Book b1 = new Book("The Man That Would Be Queen", "Ray Blanchard", 123);
        System.out.println(b.cite());
        System.out.println(b1.cite());
    }
}
