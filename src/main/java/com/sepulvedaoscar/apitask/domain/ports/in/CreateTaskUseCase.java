package com.sepulvedaoscar.apitask.domain.ports.in;

import com.sepulvedaoscar.apitask.domain.model.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);
}
