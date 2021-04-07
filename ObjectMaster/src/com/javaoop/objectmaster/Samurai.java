/**
 * 
 */
package com.javaoop.objectmaster;

/**
 * @author ccomstock
 *
 */
public class Samurai extends Human {
	private static int _count = 0;
	/**
	 * 
	 */
	public Samurai() {
		super();
		_health = 200;
		Samurai._count++;
	}
	
	public void deathBlow(Human other) {
		other.decreaseHealth(other.getHealth());
		this.decreaseHealth(_health/2);
	}
	
	public void meditate() {
		if(_health <= 133)
			increaseHealth(_health/2);
		else
			_health = 200;
	}
	
	public static int howMany() {
		return _count;
	}

}
