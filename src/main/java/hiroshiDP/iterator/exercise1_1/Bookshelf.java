package hiroshiDP.iterator.exercise1_1;

import java.util.ArrayList;

public class Bookshelf implements Aggregate {
    private ArrayList<Book> books;

    public Bookshelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
