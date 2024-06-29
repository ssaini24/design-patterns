import aggregator.AggImpl;
import book.Book;
import iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("abrakadabra", 120));
        bookList.add(new Book("gameofthrones", 150));

        AggImpl aggregator = new AggImpl(bookList);
        Iterator itr = aggregator.createIterator();
        while(itr.hasNext()){
            Book book = itr.next();
            System.out.println(book.getName());
        }
    }
}