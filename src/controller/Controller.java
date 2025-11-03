package controller;

import java.io.File;
import java.io.IOException;

public class Controller {
	public void listagem(String path) throws IOException {
		File dir = new File(path);
		
		if (!dir.exists()) {
			System.out.println("O diretório não existe!"); 
			return;
		}
		
		if (!dir.isDirectory()) {
            System.out.println("O caminho informado inválido!");
            return;
        }
		
		
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				double tam = f.length();
				if (tam < 1024 ) {
					System.out.printf("[Nome do arquivo: %-25s Tamanho: %d B ]%n", f.getName(), f.length());
				} else if (tam < 1024 * 1024) {
					System.out.printf("[Nome do arquivo: %-25s Tamanho: %.2f KB ]%n", f.getName(), f.length() / 1024.0);
				} else {
					System.out.printf("[Nome do arquivo: %-25s Tamanho: %.2f MB ]%n", f.getName(), f.length() / 1024.0 / 1024.0);
				}
			} 
		}
	}
	
}
