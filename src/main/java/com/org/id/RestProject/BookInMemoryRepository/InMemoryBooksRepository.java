package com.org.id.RestProject.BookInMemoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.org.id.RestProject.BookModel.Books;

@Repository

public class InMemoryBooksRepository {

    private List<Books> books = new ArrayList<>();

    public List<Books> findAll() {
        return books;
    }

    
    public Optional<Books> findById(int id) {
        return books.stream().filter(book -> book.getBookid() == id).findFirst();
    }
    
    
    public void save(Books book) {
        books.add(book);
    } 
    
    
    public void deleteById(int id) {
        books.removeIf(book -> book.getBookid() == id);
    }
	
}
