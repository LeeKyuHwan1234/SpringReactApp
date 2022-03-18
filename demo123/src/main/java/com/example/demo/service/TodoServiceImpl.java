package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoDao;
import com.example.demo.dto.TodoDto;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoDao todoDao;
	
	public List<TodoDto> getManyTodoList(){
		List<TodoDto> mem = todoDao.getManyTodoList();
		return mem;
	}

	@Override
	public void insertTodo(TodoDto todoDto) {
		todoDao.insertTodo(todoDto);
	}
	
	public void updateTodoText(TodoDto todoDto) {
		todoDao.updateTodoText(todoDto);
	}
	
	public void updateTodoDone(TodoDto todoDto) {
		todoDao.updateTodoDone(todoDto);
	}
	
	public void deleteTodo(TodoDto todoDto) {
		todoDao.deleteTodo(todoDto);
	}
	
	
}
