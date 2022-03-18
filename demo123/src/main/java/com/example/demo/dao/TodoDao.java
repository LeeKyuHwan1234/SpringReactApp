package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.TodoDto;

@Mapper
@Repository
public interface TodoDao {
	List<TodoDto> getManyTodoList();
	void insertTodo(TodoDto todoDto);
	void updateTodoText(TodoDto todoDto);
	void updateTodoDone(TodoDto todoDto);
	void deleteTodo(TodoDto todoDto);
}
