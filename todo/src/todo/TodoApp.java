package todo;

import java.io.IOException;

import model.Todo;
import model.User;
import service.TodoServiceImpl;
import service.UserSeviceImpl;

public class TodoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isClose = false;
		boolean isLogin = false;
		boolean isFind = false;

		String inputValue;
		String inputUserName;

		User loginUser = null;

		UserSeviceImpl userSvc = new UserSeviceImpl();
		TodoServiceImpl todoSvc = new TodoServiceImpl();
		
		ScreenHelper sh = new ScreenHelper();

		sh.clearScreen();

		while (!isClose) {

			while (!isLogin) {

				sh.clearScreen();

				sh.loginMenuDraw();

				sh.fillBlankRow(3);

				inputValue = System.console().readLine("Se�im Yap�n�z > ");

				switch (inputValue) {
				case "1":
					sh.clearScreen();

					inputUserName = System.console().readLine("Kullan�c� Ad�n�z� Giriniz > ");

					for (User u : userSvc.getUserList()) {
						if (u.getUserName().equals(inputUserName)) {
							loginUser = u;
						}
					}

					if (loginUser == null) {
						isLogin = false;
						
						System.out.println("Kullan�c� Ad� Bulunamad�. " + inputUserName);
						sh.fillBlankRow(3);
						System.console().readLine("Devam ��in Enter > ");

					} else {
						isLogin = true;
					}

					break;
				case "2":

					sh.clearScreen();

					inputUserName = System.console().readLine("Yeni Kullan�c� Ad�n�z� Giriniz > ");

					for (User u : userSvc.getUserList()) {
						if (u.getUserName().equals(inputUserName)) {
							System.out.println("Kullan�c� Ad� Daha �nce Girilmi�. " + inputUserName);

							sh.fillBlankRow(3);
							System.console().readLine("Devam ��in Enter > ");

							isFind=true;

						}

					}

					if (!isFind) {
						User u = new User();

						u.setUserId(userSvc.getUserList().size() + 1);
						u.setUserName(inputUserName);

						userSvc.userAdd(u);

						System.out.println("Kullan�c� Tan�m� Ba�ar�l�. " + inputUserName);

						sh.fillBlankRow(3);
						System.console().readLine("Devam ��in Enter > ");
						
					}
					isFind=false;


					break;
				case "3":

					isClose = true;
					isLogin = true;

					break;

				default:
					break;
				}
			}

			while (isLogin && !isClose) {

				sh.clearScreen();

				sh.mainMenuDraw(loginUser);

				sh.fillBlankRow(3);

				inputValue = System.console().readLine("Se�im Yap�n�z > ");

				switch (inputValue) {
				case "1":

					sh.clearScreen();

					inputValue = System.console().readLine("A��klama Giriniz > ");

					Todo t = new Todo();

					t.setTodoId(todoSvc.todoGetList().size() + 1);
					t.setTodoDesc(inputValue);
					t.setTodoUserId(loginUser.getUserId());

					todoSvc.todoAdd(t);

					break;
				case "2":

					sh.clearScreen();

					System.out.println("ToDo Listesi");
					sh.fillStarOnLine(13);;

					// todoSvc.todoGetList().stream().filter(td->td.getTodoUserId().equals(loginUser.getUserId()));

					for (Todo td : todoSvc.todoGetList()) {

						if (td.getTodoUserId().equals(loginUser.getUserId())) {
							System.out.println(td.getTodoId() + " " + td.getTodoDesc());
						}
					}

					sh.fillStarOnLine(13);;
					sh.fillBlankRow(3);

					inputValue = System.console().readLine("Devam ��in Enter > ");

					break;
				case "3":
					isLogin = false;

					break;

				case "4":

					isClose = true;
					isLogin = true;

					break;

				default:
					break;
				}

			}

		}
	}



}

/*
 * 
 * userSvc.getUserList().forEach(u -> { if (u.getUserName() == inputUserName) {
 * 
 * 
 * });
 */
