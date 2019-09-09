package todo;

import java.io.IOException;
import java.util.Arrays;

import model.User;

public class ScreenHelper {
	
	public void fillBlankRow(int rowCount) {
		
		for (int i = 0; i < rowCount; i++) {
			System.out.println();
		}
		
	}
	
	public void fillStarOnLine(int starCount) {
		
		char[] array = new char[starCount];
		
		Arrays.fill(array, '*');
		System.out.println(new String(array));
	}
	
	
	public void loginMenuDraw() {
		System.out.println("******************************");
		System.out.println("1. Kullan�c� Giri�i");
		System.out.println("2. Yeni Kullan�c� Tan�mlama");
		System.out.println("3. Programdan ��k");
		System.out.println("******************************");

	}

	public void mainMenuDraw(User loginUser) {
		System.out.println("Merhaba " + loginUser.getUserName());
		System.out.println("******************************");
		System.out.println("1. Todo Olu�tur");
		System.out.println("2. Todo Listele");
		System.out.println("3. Farkl� Kullan�c� �le Ba�lan");
		System.out.println("4. Programdan ��k");
		System.out.println("******************************");

	}

	public void clearScreen() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
