/**
 * 
 */
package com.javaoop.objectmaster;

/**
 * @author ccomstock
 *
 */
public class Ninja extends Human {

	/**
	 * 
	 */
	public Ninja() {
		super();
		_stealth = 10;
	}
	
	public void steal(Human other) {
		other.decreaseHealth(_stealth);
		this.increaseHealth(_stealth);
	}
	
	public void runAway() {
		this.decreaseHealth(10);
	}

}
