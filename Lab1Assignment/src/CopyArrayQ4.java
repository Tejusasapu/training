
public class CopyArrayQ4 {
	public static int[] copyOf(int[] array) {
		return array;
	}

	public static void main(String args[]) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int b[] = copyOf(ar);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
