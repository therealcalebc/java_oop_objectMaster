/**
 * 
 */
package com.javaoop.objectmaster;

/**
 * @author ccomstock
 *
 */
public class Wizard extends Human {

	/**
	 * 
	 */
	public Wizard() {
		super();
		_intelligence = 8;
		_health = 50;
	}
	
	public void heal(Human other) {
		other.increaseHealth(_intelligence);
	}
	
	public void fireball(Human other) {
		other.decreaseHealth(_intelligence * 3);
	}

}
