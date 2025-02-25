package hiroshiDP.iterator.sample;

public class Bookshelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public Bookshelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
