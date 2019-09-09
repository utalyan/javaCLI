package service;

import java.util.List;

import model.Todo;

public interface TodoService {
	void todoAdd(Todo t);

	Todo todoGetById(Integer todoId);

	List<Todo> todoGetList();

}
