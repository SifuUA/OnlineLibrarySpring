package com.okres.springlibrary.interfaces;

import com.okres.springlibrary.objects.Author;
import com.okres.springlibrary.objects.Book;
import com.okres.springlibrary.objects.Genre;

import java.util.List;

/**
 * Created by Alex on 08.07.2017.
 */
public interface BookSearch {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
}
