package com.springexample.cache;
public interface BookRepository {
    Book getByIsbn(String isbn);

}
