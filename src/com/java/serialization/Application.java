package com.java.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {
	public static void main(String[] args) throws IOException {
		
		Player p1 = new Player("Ravi", 100);
		
		File f = new File("Player.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
	}
}
