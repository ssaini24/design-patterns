package aggregator;

import book.Book;
import iterator.BookIteratorImpl;

import java.util.List;

public class AggImpl implements AggregatorItr {

    List<Book> bookList;

    public AggImpl(List<Book> bookList){
        this.bookList = bookList;
    }

    @Override
    public BookIteratorImpl createIterator() {
        return new BookIteratorImpl(this.bookList, 0);
    }
}
