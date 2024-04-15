package com.sepulvedaoscar.apitask.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorTaskInfo {

    private final Long userId;
    private final String userName;
    private final String userEmail;

}
