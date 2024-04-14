package com.sepulvedaoscar.apitask.domain.ports.in;

import com.sepulvedaoscar.apitask.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
}
