import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> Nilai_Mahasiswa = new ArrayList<Integer>();
		Nilai_Mahasiswa.add(80);
		Nilai_Mahasiswa.add(85);
		Nilai_Mahasiswa.add(88);
		Nilai_Mahasiswa.add(87);
		Nilai_Mahasiswa.add(100);
		
		System.out.println(Nilai_Mahasiswa.isEmpty());
		System.out.println("Nilai Mahasiswa" + Nilai_Mahasiswa);
		System.out.println("Ada berapa yang mempunyai nilai 88 : " + Nilai_Mahasiswa.indexOf(88));
		
		ArrayList<Integer> Nilai_Mahasiswa1 = Nilai_Mahasiswa;
		System.out.println("1" + Nilai_Mahasiswa);
		System.out.println("2" + Nilai_Mahasiswa1);
		Nilai_Mahasiswa1.remove(3);
		System.out.println("1" + Nilai_Mahasiswa);
		System.out.println("2" + Nilai_Mahasiswa1);

	}

}
