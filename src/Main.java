public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] *= 10;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] *10 = " + a[i]);
		}
	}
}