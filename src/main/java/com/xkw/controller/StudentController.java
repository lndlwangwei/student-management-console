package com.xkw.controller;

import com.xkw.common.Pagination;
import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Student;
import com.xkw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Pagination<Student> getAll(UserParamsVO params) {
        int count = studentService.countByParam(params);

        List<Student> students = studentService.getByParams(params);

        Pagination<Student> pagination = new Pagination<>(params.getCurrentPage(), params.getPageSize(), count, students);

        return pagination;
    }

    @PostMapping
    public Student add(@Valid @RequestBody Student student) {
        return studentService.add(student);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @Valid @RequestBody Student student) {
        student.setId(id);
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return studentService.delete(id);
    }
}
