package br.com.brunostaine.academia.services;

import br.com.brunostaine.academia.controllers.dtos.StudentRequestDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;

import java.util.List;

public interface IStudent {
    Student create(Student student);
    Student getById(Long id);
    List<Student> getAll(String birthDate);
    Student update(Long id, StudentRequestDTO student);
    List<PhysicalAssessment> getAllPhysicalAssessementId(Long id);
}
