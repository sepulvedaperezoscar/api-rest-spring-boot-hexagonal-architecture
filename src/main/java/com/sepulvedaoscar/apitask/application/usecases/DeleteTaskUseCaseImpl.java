package com.sepulvedaoscar.apitask.application.usecases;


import com.sepulvedaoscar.apitask.domain.ports.in.DeleteTaskUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
