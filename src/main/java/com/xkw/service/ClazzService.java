package com.xkw.service;

import com.xkw.controller.vo.ClazzParamsVO;
import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Clazz;

import java.util.List;

public interface ClazzService {
    List<Clazz> getByParams(ClazzParamsVO clazzParamsVO);

    int countByParam(ClazzParamsVO params);

    Clazz add(Clazz clazz);

    boolean update(Clazz clazz);

    boolean delete(int id);
}
