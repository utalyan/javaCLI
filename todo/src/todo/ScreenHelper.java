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
		System.out.println("1. Kullanýcý Giriþi");
		System.out.println("2. Yeni Kullanýcý Tanýmlama");
		System.out.println("3. Programdan Çýk");
		System.out.println("******************************");

	}

	public void mainMenuDraw(User loginUser) {
		System.out.println("Merhaba " + loginUser.getUserName());
		System.out.println("******************************");
		System.out.println("1. Todo Oluþtur");
		System.out.println("2. Todo Listele");
		System.out.println("3. Farklý Kullanýcý Ýle Baðlan");
		System.out.println("4. Programdan Çýk");
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
