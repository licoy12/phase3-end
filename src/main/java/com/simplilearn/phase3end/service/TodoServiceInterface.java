package com.simplilearn.phase3end.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.simplilearn.phase3end.model.Todo;


public interface TodoServiceInterface {

    List < Todo > getTodosByUser(String user);
    
	void addTodo(String name, String desc, Date startDate, Date endDate, String severity, boolean isDone)
			throws Exception;

    Optional < Todo > getTodoById(long id);

    void updateTodo(Todo todo) throws Exception;

    void deleteTodo(long id);

    void saveTodo(Todo todo);


}