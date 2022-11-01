package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    private List<Student> getStudents() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public Student getStudent(@PathVariable Long id) {
        return this.studentService.getStudentById(id);
    }

    @PostMapping("/many")
    public void addStudents(@RequestBody List<Student> students) {
        this.studentService.createStudents(students);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        this.studentService.createStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id) {
        this.studentService.deleteStudentById(id);
    }
}
