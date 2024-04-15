package com.sepulvedaoscar.apitask.infrastructure.repositories;

import com.sepulvedaoscar.apitask.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
