package com.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {
	public static void main(String[] args) throws Exception {
		
		Player p1 = new Player("Ravi", 100);
		
		File f = new File("Player.txt");
		FileOutputStream fos = new FileOutputStream(f);
		/**ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream*/
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		
		FileInputStream fis = new FileInputStream(f);
		/**ObjectInputStream is a input stream that reads serialized objects from a file*/
		ObjectInputStream ois = new ObjectInputStream(fis);
		Player p2 = (Player) ois.readObject();
		
		System.out.println(p2.toString());
	}
}
