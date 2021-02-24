package com.simplilearn.phase3end.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase3end.model.Todo;
import com.simplilearn.phase3end.repository.TodoRepository;


@Service
public class TodoService implements TodoServiceInterface {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List < Todo > getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional < Todo > getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) throws Exception{
    	if(todo.getStartDate().after(todo.getEndDate())) {
    		throw new Exception("Start cannot exceed end");
    	}
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date startDate, Date endDate, String severity, boolean isDone) throws Exception {
    	System.out.println(endDate+" ################# "+startDate);
    	if(startDate.after(endDate)) {
    		throw new Exception("Start cannot exceed end");
    	}
        todoRepository.save(new Todo(name, desc, startDate, endDate, severity, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < Todo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

}
