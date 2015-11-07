import java.util.ArrayList;

public class arrayListToArray {
	public static void main(String a[]) {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList: " + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array Content:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}
}