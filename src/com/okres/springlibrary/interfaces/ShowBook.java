package com.okres.springlibrary.interfaces;

import com.okres.springlibrary.objects.Book;

/**
 * Created by Alex on 08.07.2017.
 */
public interface ShowBook {

    void showBook(Book book);
    void downloadBook(Book book);
    void voteBook(Book book);

}
