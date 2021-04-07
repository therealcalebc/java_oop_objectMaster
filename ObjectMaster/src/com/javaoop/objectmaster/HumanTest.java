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
		
		System.out.println();
		
		Wizard w1 = new Wizard();
		System.out.println("created new Wizard, w1");
		Ninja n1 = new Ninja();
		System.out.println("created new Ninja, n1");
		Samurai s1 = new Samurai();
		System.out.println("created new Samurai, s1");
		Samurai s2 = new Samurai();
		System.out.println("created new Samurai, s2");
		System.out.printf("there are %d Samurai\n", Samurai.howMany());
		s2.deathBlow(s1);
		System.out.println("\ns2 dealt death blow to s1");
		System.out.printf("  s1 health: %d, s2 health: %d\n", s1.getHealth(), s2.getHealth());
		w1.heal(s1);
		System.out.println("w1 healed s1");
		System.out.printf("  s1 health: %d\n", s1.getHealth());
		n1.steal(s2);
		System.out.println("n1 stole health from s2");
		System.out.printf("  n1 health: %d, s2 health: %d\n", n1.getHealth(), s2.getHealth());
		w1.fireball(s2);
		System.out.println("w1 cast a fireball at s2");
		System.out.printf("  s2 health: %d\n", s2.getHealth());
		n1.runAway();
		System.out.println("\nn1 ran away");
		s1.meditate();
		System.out.println("s1 meditated");
		s2.meditate();
		System.out.println("s2 meditated");
		System.out.println("\n~ w1 stats ~");
		w1.displayStats();
		System.out.println("\n~ n1 stats ~");
		n1.displayStats();
		System.out.println("\n~ s1 stats ~");
		s1.displayStats();
		System.out.println("\n~ s2 stats ~");
		s2.displayStats();
	}

}
