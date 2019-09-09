package service;

import java.util.List;

import model.User;

public interface UserService {

	public void userAdd(User u);

	public List<User> getUserList();

	public void setUserList(List<User> userList);

}
