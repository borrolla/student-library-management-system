
package com.demo.example.student_library_management_system.converter;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.requestDto.StudentRequestDto;

public class StudentConverter {

    // converter - used to convert the request dto inputs into model class which saves in database

    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        // converts studentRequestDto into student model class
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setDob(studentRequestDto.getDob());
        student.setEmail(studentRequestDto.getEmail());
        student.setMobile(studentRequestDto.getMobile());
        student.setGender(studentRequestDto.getGender());
        student.setSemester(studentRequestDto.getSemester());

        return student;
    }
}
