
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat Berat = new StackFloat();
		Berat.cetak();
		
		Berat.push((float) 170.0);Berat.cetak();
		Berat.push((float)150.0);Berat.cetak();
		Berat.push((float)170.8);Berat.cetak();
		Berat.push((float)173.4);Berat.cetak();
		Berat.push((float)200.8);Berat.cetak();
		
		Float br = Berat.pop();Berat.cetak();
		System.out.println(br);
	}

}
