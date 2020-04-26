package hiroshiDP.iterator.sample;

public class BookshelfIterator implements Iterator {
    private Bookshelf bookshelf;
    private int index;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    @Override
    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }
}
