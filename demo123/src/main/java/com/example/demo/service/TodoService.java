package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.TodoDto;

public interface TodoService {
	List<TodoDto> getManyTodoList();
	void insertTodo(TodoDto todoDto);
	void updateTodoText(TodoDto todoDto);
	void updateTodoDone(TodoDto todoDto);
	void deleteTodo(TodoDto todoDto);
}

