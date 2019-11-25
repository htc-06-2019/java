package fr.htc.spring;

import java.util.List;

import fr.htc.data.User;

public class CustomerDAO {

	private List<User> userList;

	@Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}

	public User getUserById(Integer id) {
		for (User user : userList) {
			if (id.equals(user.getId())) {
				return user;
			}
		}
		System.out.println("User not found !!!");
		return null;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
