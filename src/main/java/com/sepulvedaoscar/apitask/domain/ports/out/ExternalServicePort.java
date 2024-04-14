package com.sepulvedaoscar.apitask.domain.ports.out;

import com.sepulvedaoscar.apitask.domain.model.AuthorTaskInfo;

public interface ExternalServicePort {

    AuthorTaskInfo getAuthorTaskInfo(Long taskId);

}
