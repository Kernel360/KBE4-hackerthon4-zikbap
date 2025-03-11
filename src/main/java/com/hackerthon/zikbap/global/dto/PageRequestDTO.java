package com.hackerthon.zikbap.global.dto;

import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Setter
public class PageRequestDTO {

    private Integer page = 1;
    private Integer size = 20;

    private int getPage() {
        if (this.page <= 0) {
            return 0;
        }
        return this.page - 1;
    }

    private Integer getSize() {
        if (this.size <= 0) {
            return 20;
        }
        return size;
    }

    public Pageable toPageable() {
        return PageRequest.of(getPage(), getSize());
    }
}
