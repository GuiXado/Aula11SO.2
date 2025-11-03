package view;

import java.io.IOException;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		Controller c = new Controller();
		try {
			c.listagem("C:\\temp");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
