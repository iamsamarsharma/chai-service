package com.spring.mssg.chaiservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ChaiPagedList extends PageImpl<ChaiDto> {
    public ChaiPagedList(List<ChaiDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public ChaiPagedList(List<ChaiDto> content) {
        super(content);
    }
}
