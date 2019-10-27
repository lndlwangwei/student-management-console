package com.xkw.service.impl;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Student;
import com.xkw.repository.StudentRepository;
import com.xkw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getByParams(UserParamsVO params) {
        return studentRepository.getByParam(params);
    }

    @Override
    public int countByParam(UserParamsVO params) {
        return studentRepository.countByParam(params);
    }

    @Override
    public Student add(Student student) {
        studentRepository.add(student);

        UserParamsVO params = new UserParamsVO();
        params.setId(student.getId());
        return this.getByParams(params).get(0);
    }

    @Override
    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean delete(int id) {
        return studentRepository.delete(id);
    }
}
