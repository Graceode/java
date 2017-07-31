/**
 * 
 */
package shiyanlou;

/**
 * @author ldd
 *
 */
public interface Younger {
	default void print(){
		System.out.println("I am a younger");
	}
	static void sayHi(){
		System.out.println("Young is the capital");
	}
}
