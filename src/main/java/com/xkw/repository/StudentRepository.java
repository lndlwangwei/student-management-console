package com.xkw.repository;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAll();

    List<Student> getByParam(UserParamsVO params);

    int countByParam(UserParamsVO params);

    boolean add(Student student);

    boolean update(Student student);

    boolean delete(int id);
}
