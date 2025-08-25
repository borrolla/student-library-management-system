
package com.demo.example.student_library_management_system.converter;

import com.demo.example.student_library_management_system.model.Author;
import com.demo.example.student_library_management_system.requestDto.AuthorRequestDto;

public class AuthorConverter {

    public static Author convertAuthorRequestDtoIntoAuthor(AuthorRequestDto authorRequestDto){
        Author author = new Author();

        author.setName(authorRequestDto.getName());
        author.setCountry(authorRequestDto.getCountry());
        author.setEmail(authorRequestDto.getEmail());
        author.setGender(authorRequestDto.getGender());
        author.setRating(authorRequestDto.getRating());

        return author;
    }
}

