package hiroshiDP.iterator.sample;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);
        bookshelf.appendBook(new Book("Around the world in 80 days"));
        bookshelf.appendBook(new Book("Bible"));
        bookshelf.appendBook(new Book("Cassandra: definitive guide"));
        bookshelf.appendBook(new Book("Daddy-Long-Legs"));
        bookshelf.appendBook(new Book("Evangelion"));
        Iterator it = bookshelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
