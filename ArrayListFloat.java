import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
		ArrayList<Float> BeratBadan = new ArrayList<Float>();
		BeratBadan.add((float)50.4);
		BeratBadan.add((float)60.13);
		BeratBadan.add((float)58.0);
		
		System.out.println("Berapa Banyak Data : " + BeratBadan.size());
		System.out.println("Berat Badan : " + BeratBadan);
		BeratBadan.set(0, (float) 50.35);
		BeratBadan.set(2, (float) 60.25);
		System.out.println("Berat Badan : " + BeratBadan);

	}

}
