package service;

import java.util.ArrayList;
import java.util.List;

import model.Todo;
import model.User;

public class TodoDb {

	List<User> users = new ArrayList<>();
	List<Todo> todos = new ArrayList<>();

	public void userAdd(User u) {

		users.add(u);

	}

	public List<User> getUserList() {

		return users;

	}

	public void todoAdd(Todo t) {

		todos.add(t);

	}

	public List<Todo> getTodoList() {
		return todos;

	}

	public Todo getTodoById(Integer id) {

		Todo t = todos.get(id);

		return t;

	}

}
