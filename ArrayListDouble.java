import java.util.ArrayList;

public class ArrayListDouble {

		public static void main(String[] args) {
			ArrayList<Double> TinggiBadan = new ArrayList<Double>();
			TinggiBadan.add(160.5);
			TinggiBadan.add(170.5);
			TinggiBadan.add(180.5);
			TinggiBadan.add(190.5);
				
			System.out.println("Apakah ArrayList Kosong : " + TinggiBadan.isEmpty());
			System.out.println("Tinggi Badan : " + TinggiBadan);
			System.out.println("Berapa Jumlah Data : " + TinggiBadan.size());
			TinggiBadan.remove(3);
			System.out.println("Tinggi Badan : " + TinggiBadan);
	}

}
