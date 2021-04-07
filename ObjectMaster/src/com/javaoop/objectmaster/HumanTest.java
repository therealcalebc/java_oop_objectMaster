/**
 * 
 */
package com.javaoop.objectmaster;

/**
 * @author ccomstock
 *
 */
public class HumanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println("created new Human, h1");
		Human h2 = new Human();
		System.out.println("created new Human, h2");
		h1.attack(h2);
		System.out.println("\nh1 attacked h2");
		System.out.println("\n~ h1 stats ~");
		h1.displayStats();
		System.out.println("\n~ h2 stats ~");
		h2.displayStats();
	}

}
