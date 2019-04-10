package com.xkw.controller;

import com.xkw.common.Pagination;
import com.xkw.controller.vo.ClazzParamsVO;
import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.Clazz;
import com.xkw.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clazz")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public Pagination<Clazz> getAll(ClazzParamsVO params) {
        int count = clazzService.countByParam(params);

        List<Clazz> users = clazzService.getByParams(params);

        Pagination<Clazz> pagination = new Pagination<>(params.getCurrentPage(), params.getPageSize(), count, users);

        return pagination;
    }

    @PostMapping
    public Clazz add(@Valid @RequestBody Clazz clazz) {
        return clazzService.add(clazz);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @Valid @RequestBody Clazz clazz) {
        clazz.setId(id);
        return clazzService.update(clazz);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return clazzService.delete(id);
    }
}
