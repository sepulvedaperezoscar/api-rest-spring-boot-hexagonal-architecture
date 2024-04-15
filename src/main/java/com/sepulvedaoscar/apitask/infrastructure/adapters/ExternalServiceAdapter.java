package com.sepulvedaoscar.apitask.infrastructure.adapters;

import com.sepulvedaoscar.apitask.domain.model.AuthorTaskInfo;
import com.sepulvedaoscar.apitask.domain.ports.out.ExternalServicePort;

public class ExternalServiceAdapter implements ExternalServicePort {

    @Override
    public AuthorTaskInfo getAuthorTaskInfo(Long taskId) {
        return null;
    }
}
