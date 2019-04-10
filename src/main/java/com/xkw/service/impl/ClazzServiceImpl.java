package com.xkw.service.impl;

import com.xkw.controller.vo.ClazzParamsVO;
import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Clazz;
import com.xkw.repository.ClazzRepository;
import com.xkw.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    ClazzRepository clazzRepository;

    @Override
    public List<Clazz> getByParams(ClazzParamsVO params) {
        return clazzRepository.getByParam(params);
    }

    @Override
    public int countByParam(ClazzParamsVO params) {
        return clazzRepository.countByParam(params);
    }

    @Override
    public Clazz add(Clazz clazz) {
        clazzRepository.add(clazz);

        ClazzParamsVO params = new ClazzParamsVO();
        params.setId(clazz.getId());

        return this.getByParams(params).get(0);
    }

    @Override
    public boolean update(Clazz clazz) {
        return clazzRepository.update(clazz);
    }

    @Override
    public boolean delete(int id) {
        return clazzRepository.delete(id);
    }
}
