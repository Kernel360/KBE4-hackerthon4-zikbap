package com.hackerthon.zikbap.global.dto;

import lombok.Getter;

@Getter
public class BaseResponseDTO {

    private String msg;
    private int status;

    public BaseResponseDTO(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }
}
