public class Index {
    public static void main(String args[]) {
        System.out.println("Hello, world!");

        doMethod("Checking method!");
        doMethod2(6);
    }

	private static String doMethod(String str) {
		return str;
	}

	private static void doMethod2(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("item#" + (i+1));
		}
	}

}
