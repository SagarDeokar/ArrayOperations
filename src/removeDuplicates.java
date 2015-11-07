import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicates {
	public static void main(String[] str) {
		ArrayList<String> alb = new ArrayList<String>();

		alb.add("PHP");
		alb.add("JAVA");
		alb.add("C++");
		alb.add("PHP");
		alb.add("JAVA");
		alb.add("PERL");
		alb.add("PHP");

		System.out
				.println("ArrayList Before Removing Duplicate Values: " + alb);

		ArrayList<String> ala = new ArrayList<String>(
				new LinkedHashSet<String>(alb));

		System.out.println("ArrayList After Removing Duplicate Values: " + ala);

		ala.remove("C++");

		System.out.println("ArrayList After Removing C++: " + ala);

		String[] a = new String[ala.size()];

		ala.toArray(a);

		System.out.println("Array After Removing Duplicate Values: "
				+ Arrays.toString(a));
	}
}