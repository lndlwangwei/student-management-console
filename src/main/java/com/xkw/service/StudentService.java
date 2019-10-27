package com.xkw.service;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    List<Student> getByParams(UserParamsVO params);

    int countByParam(UserParamsVO params);

    Student add(Student student);

    boolean update(Student student);

    boolean delete(int id);
}
