package com.xkw.controller.vo;

import com.xkw.common.Pagination;
import com.xkw.domain.Clazz;

public class ClazzParamsVO extends Pagination<Clazz> {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
