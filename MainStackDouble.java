
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push(42.30);Tinggi.cetak();
		Tinggi.push(40.80);Tinggi.cetak();
		Tinggi.push(60.80);Tinggi.cetak();
		
		
		Double tg = Tinggi.pop();Tinggi.cetak();
		System.out.println(tg);

	}

}
