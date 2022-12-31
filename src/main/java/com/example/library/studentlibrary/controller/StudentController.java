package com.example.library.studentlibrary.controller;

import com.example.library.studentlibrary.models.Author;
import com.example.library.studentlibrary.models.Student;
import com.example.library.studentlibrary.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Add required annotations
public class StudentController {

    //Add required annotations
    @Autowired
    StudentService studentService;
    @PostMapping("/create-student")
    public ResponseEntity<String> createStudents(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("Student Added",HttpStatus.CREATED);
    }
    @PutMapping("/update-student")
    public ResponseEntity<String> updateStudents(@RequestBody Student student){
        studentService.updateStudent(student);
        return new ResponseEntity<>("Student Updated",HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-student")
    public ResponseEntity<String> deleteStudents(@RequestParam("id") int id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Deleted",HttpStatus.CREATED);
    }
    @GetMapping("/get-student-by-email")
    public ResponseEntity getStudentByEmail(@RequestParam("email") String email){
        return new ResponseEntity<>("Student details printed successfully ", HttpStatus.OK);
    }

    //Add required annotations
    @GetMapping("/get-student-by-id")
    public ResponseEntity getStudentById(@RequestParam("id") int id){

        return new ResponseEntity<>("Student details printed successfully ", HttpStatus.OK);
    }

    //Add required annotations
    public ResponseEntity createStudent(@RequestBody Student student){

        return new ResponseEntity<>("the student is successfully added to the system", HttpStatus.CREATED);
    }

    //Add required annotations
    public ResponseEntity updateStudent(@RequestBody Student student){

        return new ResponseEntity<>("student is updated", HttpStatus.ACCEPTED);
    }

    //Add required annotations
    public ResponseEntity deleteStudent(@RequestParam("id") int id){

        return new ResponseEntity<>("student is deleted", HttpStatus.ACCEPTED);
    }

}
