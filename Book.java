public class Book {
    public String title;
    public String author;
    public int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title){
        this(title, "Unknown", 100);
    }

    public  String cite(){
        return this.title + " by " + this.author + ", " + this.pages + " pages";
    }
}
