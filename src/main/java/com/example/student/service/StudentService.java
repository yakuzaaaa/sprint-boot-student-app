package com.example.student.service;

import com.example.student.dao.StudentDao;
import com.example.student.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAll();
    }

    public void createStudent(Student student) {
        studentDao.save(student);
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentDao.getById(id);

        return student.orElseThrow(IllegalStateException::new);
    }

    public void deleteStudentById(Long id) {
        studentDao.deleteById(id);
    }

    public void createStudents(List<Student> students) {
        this.studentDao.saveAll(students);
    }
}
