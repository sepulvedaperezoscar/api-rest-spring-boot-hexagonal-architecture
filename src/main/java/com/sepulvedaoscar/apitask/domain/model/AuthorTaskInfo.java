package com.sepulvedaoscar.apitask.domain.model;

import lombok.Data;

@Data
public class AuthorTaskInfo {

    private final Long userId;
    private final String userName;
    private final String userEmail;

}
