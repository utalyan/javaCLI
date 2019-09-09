package model;

public class Todo {

	Integer todoId;
	String todoDesc;
	boolean todoStatus;
	Integer todoUserId;

	public Integer getTodoId() {
		return todoId;
	}

	public void setTodoId(Integer todoId) {
		this.todoId = todoId;
	}

	public String getTodoDesc() {
		return todoDesc;
	}

	public void setTodoDesc(String todoDesc) {
		this.todoDesc = todoDesc;
	}

	public boolean isTodoStatus() {
		return todoStatus;
	}

	public void setTodoStatus(boolean todoStatus) {
		this.todoStatus = todoStatus;
	}

	public Integer getTodoUserId() {
		return todoUserId;
	}

	public void setTodoUserId(Integer todoUserId) {
		this.todoUserId = todoUserId;
	}

}
