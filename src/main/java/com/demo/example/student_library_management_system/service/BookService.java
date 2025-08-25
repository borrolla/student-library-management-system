
package com.demo.example.student_library_management_system.service;

import com.demo.example.student_library_management_system.converter.BookConverter;
import com.demo.example.student_library_management_system.model.Author;
import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.model.Card;
import com.demo.example.student_library_management_system.repository.AuthorRepository;
import com.demo.example.student_library_management_system.repository.BookRepository;
import com.demo.example.student_library_management_system.repository.CardRepository;
import com.demo.example.student_library_management_system.requestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private CardRepository cardRepository;

    public String saveBook(BookRequestDto bookRequestDto){
        Book book = BookConverter.convertBookRequestDtoIntoBook(bookRequestDto);

        //here we have have to add authorid and cardid as well

        Author author = authorRepository.findById(bookRequestDto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found with id " + bookRequestDto.getAuthorId()));

        Card card = cardRepository.findById(bookRequestDto.getCardId())
                .orElseThrow(() -> new RuntimeException("Card not found with id " + bookRequestDto.getCardId()));


        bookRepository.save(book);
        return "Book saved successfully";
    }
}
