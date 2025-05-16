package fr.takima.training.simpleapi.repository;

import fr.takima.training.simpleapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
