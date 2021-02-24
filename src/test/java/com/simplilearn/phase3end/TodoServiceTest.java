package com.simplilearn.phase3end;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.simplilearn.phase3end.model.Todo;
import com.simplilearn.phase3end.repository.TodoRepository;
import com.simplilearn.phase3end.service.TodoService;

@SpringBootTest
public class TodoServiceTest {
	
	
	 @TestConfiguration
	    static class AuthenticationTestContextConfiguration {
	 
	        @Bean
	        public TodoService todoService() {
	            return new TodoService();
	        }
	    }
	 
	@Autowired
	TodoService todoService;
	
	@Autowired
	TodoRepository todoRepository;
	
	@Test
	public void addTask_returnTask() {
		
		Todo task1 = new Todo();
		task1.setDescription("Test Description");
		task1.setStartDate(new Date(2021-01-02));
		task1.setEndDate(new Date(2021-02-02));
		task1.setId(1);
		task1.setUserName("testuser");
		
		//todoService.saveTodo(task1);
		todoRepository.save(task1);
		
		Optional<Todo> addedTodo = todoService.getTodoById(1);
		
		assertThat(addedTodo).isEqualTo(task1);
	}
}
