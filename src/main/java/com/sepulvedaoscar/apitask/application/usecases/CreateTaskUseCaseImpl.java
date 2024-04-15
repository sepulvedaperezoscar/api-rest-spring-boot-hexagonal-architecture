package com.sepulvedaoscar.apitask.application.usecases;

import com.sepulvedaoscar.apitask.domain.model.Task;
import com.sepulvedaoscar.apitask.domain.ports.in.CreateTaskUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
