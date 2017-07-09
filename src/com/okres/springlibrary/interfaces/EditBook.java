package com.okres.springlibrary.interfaces;

import com.okres.springlibrary.objects.Book;

/**
 * Created by Alex on 08.07.2017.
 */
public interface EditBook {
    boolean save (Book book);
    boolean delete (Book book);
    boolean edit (Book book);
    boolean add(Book book);
}
