package com.sepulvedaoscar.apitask.infrastructure.config;

import com.sepulvedaoscar.apitask.application.services.TaskService;
import com.sepulvedaoscar.apitask.application.usecases.*;
import com.sepulvedaoscar.apitask.domain.ports.in.GetAuthorTaskInfoUseCase;
import com.sepulvedaoscar.apitask.domain.ports.out.ExternalServicePort;
import com.sepulvedaoscar.apitask.domain.ports.out.TaskRepositoryPort;
import com.sepulvedaoscar.apitask.infrastructure.adapters.ExternalServiceAdapter;
import com.sepulvedaoscar.apitask.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAuthorTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAuthorTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAuthorTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
