package com.example.student.dao;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentDao {
    private final StudentRepository studentRepository;

    public List<Student> getAll() {
        return this.studentRepository.findAll();
    }

    public void save(Student student) {
        this.studentRepository.save(student);
    }

    public Optional<Student> getById(Long id) {
        return this.studentRepository.findById(id);
    }

    public void deleteById(Long id) {
        this.studentRepository.deleteById(id);
    }

    public void saveAll(List<Student> students) {
        this.studentRepository.saveAll(students);
    }
}
