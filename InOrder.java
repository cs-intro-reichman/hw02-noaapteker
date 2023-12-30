/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int pre = (int)(Math.random()*(10-0));
		System.out.print(pre + " ");
		int next = (int)(Math.random()*(10-0));
		while (next>=pre) {
			System.out.print(next + " ");
			pre = next;
			next = (int)(Math.random()*(10-0));
		}
	}
}