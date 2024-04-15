package com.sepulvedaoscar.apitask.application.services;

import com.sepulvedaoscar.apitask.domain.model.AuthorTaskInfo;
import com.sepulvedaoscar.apitask.domain.model.Task;
import com.sepulvedaoscar.apitask.domain.ports.in.*;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase, GetAuthorTaskInfoUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAuthorTaskInfoUseCase getAuthorTaskInfoUseCase;

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return retrieveTaskUseCase.getTaskById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return updateTaskUseCase.updateTask(id, updatedTask);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AuthorTaskInfo getAuthorTaskInfo(Long taskId) {
        return getAuthorTaskInfoUseCase.getAuthorTaskInfo(taskId);
    }
}
