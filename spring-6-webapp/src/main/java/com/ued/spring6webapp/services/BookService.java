package com.ued.spring6webapp.services;

import com.ued.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
