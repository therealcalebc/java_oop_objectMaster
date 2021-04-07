/**
 * 
 */
package com.javaoop.objectmaster;

/**
 * @author ccomstock
 *
 */
public class Human {
	protected int _strength;
	protected int _stealth;
	protected int _intelligence;
	protected int _health;
	
	public Human() {
		_strength = _stealth = _intelligence = 3;
		_health = 100;
	}
	
	public void reduceHealth(int amount) { _health -= amount; }
	public void increaseHealth(int amount) { _health += amount; }
	
	public void attack(Human other) {
		other.reduceHealth(this._strength);
	}
	
	public void displayStats() {
		System.out.println("Health: " + _health);
		System.out.println("Strength: " + _strength);
		System.out.println("Stealth: " + _stealth);
		System.out.println("Intelligence: " + _intelligence);
	}
}
