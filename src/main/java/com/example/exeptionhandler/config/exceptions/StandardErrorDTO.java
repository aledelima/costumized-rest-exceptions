package com.example.exeptionhandler.config.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class StandardErrorDTO {

    private LocalDateTime timeStamp;
    private Integer status;
    private String error;
    private String path;
}
