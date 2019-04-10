package com.xkw.repository;

import com.xkw.controller.vo.ClazzParamsVO;
import com.xkw.domain.Clazz;

import java.util.List;

public interface ClazzRepository {
    List<Clazz> getByParam(ClazzParamsVO params);

    int countByParam(ClazzParamsVO params);

    void add(Clazz clazz);

    boolean update(Clazz clazz);

    boolean delete(int id);
}
