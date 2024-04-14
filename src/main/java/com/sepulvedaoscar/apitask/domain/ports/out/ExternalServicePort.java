package com.sepulvedaoscar.apitask.domain.ports.out;

import com.sepulvedaoscar.apitask.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
