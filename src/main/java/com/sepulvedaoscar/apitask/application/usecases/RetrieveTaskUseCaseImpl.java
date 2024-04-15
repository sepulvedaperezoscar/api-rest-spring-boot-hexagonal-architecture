package com.sepulvedaoscar.apitask.application.usecases;

import com.sepulvedaoscar.apitask.domain.model.Task;
import com.sepulvedaoscar.apitask.domain.ports.in.RetrieveTaskUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
