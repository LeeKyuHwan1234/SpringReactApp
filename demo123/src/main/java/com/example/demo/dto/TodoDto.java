package com.example.demo.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class TodoDto {
	private String id;
	private String text;
	private String done;
}