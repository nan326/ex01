package com.example.ex01.repository;

import com.example.ex01.entity.Task;
import com.example.ex01.repository.CustomizedRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository extends CustomizedRepository<Task, Integer> {
    @Query("SELECT t FROM Task t ")
    List<Task> findAllTasks();
    @Query("SELECT t FROM Task t WHERE t.id=:kid")
    Task findTaskById(@Param("kid") int kid);
}
