
package com.demo.example.student_library_management_system.converter;

import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.requestDto.BookRequestDto;

public class BookConverter {

    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto){
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setAvailability(bookRequestDto.isAvailability());
        book.setCategory(bookRequestDto.getCategory());
        book.setPages(bookRequestDto.getPages());
        book.setPublishedDate(bookRequestDto.getPublishedDate());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setRackNo(bookRequestDto.getRackNo());

        return  book;
    }
}

