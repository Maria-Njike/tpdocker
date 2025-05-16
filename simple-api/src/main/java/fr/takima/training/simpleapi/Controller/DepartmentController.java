package fr.takima.training.simpleapi.controller;

import fr.takima.training.simpleapi.model.Department;
import fr.takima.training.simpleapi.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/{name}/students")
    public Department getDepartmentWithStudents(@PathVariable String name) {
        return departmentRepository.findByName(name);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
