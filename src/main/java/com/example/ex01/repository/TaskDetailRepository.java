package com.example.ex01.repository;

import com.example.ex01.entity.TaskDetail;
import com.example.ex01.repository.CustomizedRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskDetailRepository extends CustomizedRepository<TaskDetail, Integer> {
    @Query("SELECT td FROM TaskDetail td")
    List<TaskDetail> findAllTaskDetail();
    @Query("SELECT td FROM TaskDetail td WHERE td.teacher.id =:tid AND td.status =:status")
    List<TaskDetail> findMyTaskDetail(@Param("tid") int tid,@Param("status") int status);
    @Query("SELECT td FROM TaskDetail td WHERE td.task.id =:tid")
    List<TaskDetail> findMyAllTaskDetail(@Param("tid") int tid);
}
