package service;

import java.util.List;

import model.Todo;

public class TodoServiceImpl implements TodoService {

	TodoDb tddb = new TodoDb();

	@Override
	public void todoAdd(Todo t) {
		// TODO Auto-generated method stub
		tddb.todoAdd(t);
	}

	@Override
	public Todo todoGetById(Integer todoId) {
		// TODO Auto-generated method stub
		return tddb.getTodoById(todoId);
	}

	@Override
	public List<Todo> todoGetList() {
		// TODO Auto-generated method stub
		return tddb.getTodoList();
	}
}
