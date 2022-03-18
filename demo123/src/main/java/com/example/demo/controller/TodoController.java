package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TodoDto;
import com.example.demo.service.TodoService;

@CrossOrigin(origins ="*")
@RestController
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@GetMapping(value = "/todolist")
	public List<TodoDto> getManyTodoList(Model model) {
		List<TodoDto> mem = null;
		try {
			mem = todoService.getManyTodoList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mem;
	}
	
	@PostMapping(value ="/inserttodo")
	public void insertTodo(Model model, @RequestBody TodoDto todoDto) {
		try {
			todoService.insertTodo(todoDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value ="/updatetext")
	public void updateTodoText(Model model, @RequestBody TodoDto todoDto) {
		try {
			todoService.updateTodoText(todoDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PutMapping(value ="/updatedone")
	public void updateTodoDone(Model model, @RequestBody TodoDto todoDto) {
		try {
			todoService.updateTodoDone(todoDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value ="/deletetodo")
	public void deleteTodo(Model model, @RequestBody TodoDto todoDto) {
		try {
			todoService.deleteTodo(todoDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
