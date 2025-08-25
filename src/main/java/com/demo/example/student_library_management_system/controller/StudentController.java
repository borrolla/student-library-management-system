
package com.demo.example.student_library_management_system.controller;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.requestDto.StudentRequestDto;
import com.demo.example.student_library_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*
    HTTP response code
    200 -ok-success
    201-created
    400-bad request
    404-not found
    500-internal server error
    401-un-authorization
     */

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody StudentRequestDto studentRequestDto){
        try {
            String response = studentService.saveStudent(studentRequestDto);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Some exception occured : "+e.getMessage());
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findStudentById(@PathVariable int id){
        try {
            Student student = studentService.getStudentById(id);
            return ResponseEntity.ok(student);
        } catch (Exception e){
            return ResponseEntity.internalServerError().body("some exception occured : "+e.getMessage());
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAllStudent(){
        try {
            List<Student> studentList = studentService.getAllStudents();
            return ResponseEntity.ok(studentList);
        } catch (Exception e){
            return ResponseEntity.internalServerError().body("some exception occured : "+e.getMessage());
        }
    }

    @GetMapping("/findAllByPage")
    public List<Student> findAllStudentUsingPage(@RequestParam int pageNo,@RequestParam int pageSize){
        List<Student> studentPage = studentService.findAllStudentsByPage(pageNo,pageSize);
        return studentPage;
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody StudentRequestDto studentRequestDto){
        String response = studentService.updateStudent(id,studentRequestDto);
        return response;
    }

    @PatchMapping("/update/{id}")
    public String updateStudentSemester(@PathVariable int id, @RequestParam String semester){
        String response  = studentService.updateStudentSemester(id,semester);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable int id){
        String response = studentService.deleteStudentById(id);
        return response;
    }

    @GetMapping("/findByEmail")
    public Student findStudentByEmail(@RequestParam String email){
        Student student = studentService.findStudentByEmail(email);
        return student;
    }

    @GetMapping("/findByDept")
    public List<Student> findStudentByDept(@RequestParam String dept){
        List<Student> studentList = studentService.findStudentByDepartment(dept);
        return studentList;
    }

    @GetMapping("/findBySemAndDept")
    public List<Student> findStudentBySemAndDept(@RequestParam String sem,@RequestParam String dept){
        List<Student> studentList = studentService.findStudentBySemAndDepartment(sem,dept);
        return studentList;
    }

    @GetMapping("/findBySemOrDept")
    public List<Student> findStudentBySemOrDept(@RequestParam String sem,@RequestParam String dept){
        List<Student> studentList = studentService.findStudentBySemOrDepartment(sem,dept);
        return studentList;
    }


    @GetMapping("/findByEmailQuery")
    public Student findStudentByEmailQuery(@RequestParam String email){
        Student student = studentService.getEmailByQuery(email);
        return student;
    }

}
