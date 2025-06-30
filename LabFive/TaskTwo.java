class LibraryBook {
    private String title;
    private String author;
    private int bookID;
    public LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Book ID: " + this.bookID);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 101);
        LibraryBook book2 = new LibraryBook("Rich Dad Poor Dad", "Robert Kiyosaki", 102);
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
