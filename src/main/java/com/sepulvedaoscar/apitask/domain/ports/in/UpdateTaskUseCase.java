package com.sepulvedaoscar.apitask.domain.ports.in;


import com.sepulvedaoscar.apitask.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task updatedTask);
}
