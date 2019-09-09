package service;

import java.util.List;

import model.User;

public class UserSeviceImpl implements UserService {

	TodoDb tddb = new TodoDb();

	public void userAdd(User u) {
		tddb.userAdd(u);
	}

	public List<User> getUserList() {
		return tddb.getUserList();
	}

	public void setUserList(List<User> userList) {
		tddb.users.addAll(userList);
	}

}
