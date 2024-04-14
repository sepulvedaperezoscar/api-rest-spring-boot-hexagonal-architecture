package com.sepulvedaoscar.apitask.domain.ports.in;

import com.sepulvedaoscar.apitask.domain.model.AuthorTaskInfo;

public interface GetAuthorTaskInfoUseCase {

    AuthorTaskInfo getAuthorTaskInfo(Long id);

}
