/**
 * 
 */
package vpatlidzanovic;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Testet das Programm.
 * @author Viktor Patlidzanovic
 *
 */
public class Test {

	/**
	 * Testet das Programm.
	 * @param args
	 */
	public static void main(String[] args) {
		SortedSet<Schüler> s = new TreeSet<>();
		s.add(new Schüler(19, "Viktor", "Patlidzanovic", "B"));
		System.out.println(s.first().equals(new Schüler(19, "Viktor", "Patlidzanovic", "B")));
		System.out.println(s.first().hashCode());
		System.out.println(s.first().compareTo(new Schüler(20, "Viktor", "Patlidzanovic", "B")));
	}

}
