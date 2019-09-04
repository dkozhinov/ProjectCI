// by KozhinovDA

public class Index {
    public static void main(String args[]) {
        System.out.println("Hello, world!");
        doMethod("Checking method!");
        doMethod2(12);
    }

    private static void doMethod(String str) {
        System.out.println(str);
    }

    private static void doMethod2(int n) {
    	int i;
    	for(i=0; i<n; i++) {
    		System.out.println("item#" + (i+1));
    	}
    	if (i == n) {
    		doMethod3("doMethod2");
    	}
    }

    private static void doMethod3(String str) {
    	System.out.println(str + " passed!");
    }

}
