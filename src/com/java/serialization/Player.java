package com.java.serialization;

import java.io.Serializable;

/**
 * -> To serialize a class, it must implement the Serializable interface.
 * -> Serializable interface is a `marker interface` in Java.
 * -> A marker interface do not have any methods or fields, thus the implementing class
 *    do not have to implement any method.
 * */
public class Player implements Serializable {
	private String name;
	private int score;
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}
	
}
