package com.sepulvedaoscar.apitask.application.usecases;

import com.sepulvedaoscar.apitask.domain.model.AuthorTaskInfo;
import com.sepulvedaoscar.apitask.domain.ports.in.GetAuthorTaskInfoUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.ExternalServicePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAuthorTaskInfoUseCaseImpl implements GetAuthorTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    @Override
    public AuthorTaskInfo getAuthorTaskInfo(Long id) {
        return externalServicePort.getAuthorTaskInfo(id);
    }
}
