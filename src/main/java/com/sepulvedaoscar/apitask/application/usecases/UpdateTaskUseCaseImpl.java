package com.sepulvedaoscar.apitask.application.usecases;

import com.sepulvedaoscar.apitask.domain.model.Task;
import com.sepulvedaoscar.apitask.domain.ports.in.UpdateTaskUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }
}
