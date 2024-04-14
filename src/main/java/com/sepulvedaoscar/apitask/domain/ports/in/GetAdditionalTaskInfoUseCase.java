package com.sepulvedaoscar.apitask.domain.ports.in;

import com.sepulvedaoscar.apitask.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);

}
