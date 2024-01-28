package com.org.id.RestProject.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.id.RestProject.BookInMemoryRepository.InMemoryBooksRepository;
import com.org.id.RestProject.BookModel.Books;

@Service
public class BooksService {
	
	@Autowired
    private InMemoryBooksRepository booksRepository;

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }
    
    
    
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }
}

	
	
	
	
	
	
	
	
	

