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
		SortedSet<Sch�ler> s = new TreeSet<>();
		s.add(new Sch�ler(19, "Viktor", "Patlidzanovic", "B"));
		System.out.println(s.first().equals(new Sch�ler(19, "Viktor", "Patlidzanovic", "B")));
		System.out.println(s.first().hashCode());
		System.out.println(s.first().compareTo(new Sch�ler(20, "Viktor", "Patlidzanovic", "B")));
	}

}
