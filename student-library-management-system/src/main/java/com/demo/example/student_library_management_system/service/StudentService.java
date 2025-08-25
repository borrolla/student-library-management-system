
package com.demo.example.student_library_management_system.service;

import com.demo.example.student_library_management_system.converter.StudentConverter;
import com.demo.example.student_library_management_system.enums.CardStatus;
import com.demo.example.student_library_management_system.model.Card;
import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.repository.StudentRepository;
import com.demo.example.student_library_management_system.requestdto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(StudentRequestDto studentRequestDto){

        // first convert studentrequestdto into student object
        Student student = StudentConverter.convertStudentRequestDtoIntoStudent(studentRequestDto);

        if(student==null){
            throw new RuntimeException("student not saved");
        }

        //whenever the student are added card also issued/added at same time
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVE);

        student.setCard(card);
        card.setStudent(student);

        studentRepository.save(student);
        return "Student and card saved successfully";
    }

    public Student getStudentById(int id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()){
            throw new RuntimeException("Student with id "+id+" not found");
        }
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }
        return null;
    }

    public List<Student> getAllStudents(){
        List<Student> studentList=studentRepository.findAll();
        if(studentList.isEmpty()){
            throw new RuntimeException("no students found");
        }
        return studentList;
    }

    /*
    pagination - fetching the data or records in the form of pages
    pagenumber- the number of page we want to see(page number starts from 0,1,2,3,4,...)
    pagsize - the total number of record in each page

    database total records - 28, page size -5
    0th page-1-5
    1st page-6-10
    2nd page-11-15
    3rd page-16-20
    4th page-21-25
    5th page-26-28

    database total records - 11, pagesize-2
    0th page-1-2
    1st page-3-4
    2nd page-5-6
    3rd page-7-8
    4th page-9-10
    5th page-11

    database record s-13 pagesize-4
    0th page -1-4
    1st page -5-8
    2nd page - 9-12
    3rd page -13
    4th page - no data

    Sorting - arranging the data or records in ascending or descending order
     */
    public List<Student> findAllStudentsByPage(int pageNo, int pageSize){
        // only pagination - Page<Student> studentPage = studentRepository.findAll(PageRequest.of(pageNo,pageSize));
        // pagination along with sorting use below line
        Page<Student> studentPage = studentRepository.findAll(PageRequest.of(pageNo,pageSize, Sort.by("name").ascending()));
        return studentPage.getContent();
    }



    public String updateStudent(int id, StudentRequestDto studentRequestDto){
        Student student = getStudentById(id);
        if(student!=null){
            student.setName(studentRequestDto.getName());
            student.setDepartment(studentRequestDto.getDepartment());
            student.setDob(studentRequestDto.getDob());
            student.setEmail(studentRequestDto.getEmail());
            student.setMobile(studentRequestDto.getMobile());
            student.setGender(studentRequestDto.getGender());
            student.setSemester(studentRequestDto.getSemester());

            studentRepository.save(student);
            return "student updated";
        }else{
            return "Student not found, cannot update";
        }
    }

    public String updateStudentSemester(int id, String semester){
        Student student = getStudentById(id);
        if(student!=null){
            student.setSemester(semester);
            studentRepository.save(student);
            return "Student semester updated";
        }else{
            return "Student not found, cannot update";
        }
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "student with id "+id+" deleted successfully";
    }

    public Student findStudentByEmail(String email){
        Student student = studentRepository.findByEmail(email);
        return student;
    }

    public List<Student> findStudentByDepartment(String dept){
        List<Student> studentList = studentRepository.findByDepartment(dept);
        return studentList;
    }

    public List<Student> findStudentBySemAndDepartment(String sem, String dept){
        List<Student> studentList = studentRepository.findBySemesterAndDepartment(sem,dept);
        return studentList;
    }

    public List<Student> findStudentBySemOrDepartment(String sem, String dept){
        List<Student> studentList = studentRepository.findBySemesterOrDepartment(sem,dept);
        return studentList;
    }

    public Student getEmailByQuery(String email){
        Student student = studentRepository.getEmailByQuery(email);
        return student;
    }

}

