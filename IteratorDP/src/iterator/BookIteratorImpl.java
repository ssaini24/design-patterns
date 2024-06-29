package iterator;

import book.Book;

import java.util.List;

public class BookIteratorImpl implements  Iterator {

    int index;
    List<Book> bookList;

    public BookIteratorImpl(List<Book> bookList, int index){
        this.index = index;
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index != bookList.size();
    }

    @Override
    public Book next() {
        if (hasNext()){
            return bookList.get(index++);
        }

        return null;
    }
}
