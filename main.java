package tugasjava2;

import tugasjava2.kotak;
import tugasjava2.mahasiswa;
import tugasjava2.node;
import tugasjava2.stack;

public class main {

	public static void main(String[] args) {
	System.out.println("------Object Kelas Kotak------");
	// membuat object dari class kotak
	kotak main = new kotak();
		
	// method setter kotak
	main.setpanjang(10.23);
	main.setlebar(4.56);
		
	// method getter kotak
	System.out.println("panjang : " + main.getpanjang());
	System.out.println("lebar : " + main.getlebar());
	System.out.println("luas : " + main.getpanjang()*main.getlebar());
	System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
	
	System.out.println("------Object Kelas mahasiswa------");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "muhammad gazali";
	mahasiswa.nim = "D0217361";
	mahasiswa.alamat = "tapalang";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "janda";
	mahasiswa.tinggiBadan = "179";
	mahasiswa.beratBadan = "58";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	System.out.println("------Object Kelas node------");
	//membuat object darikelas node
	node node = new node();
	
	//method setter node
	node.label = "AQUA";
	node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + node.getlabel());
	System.out.println("jumlah label : " + node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object darikelas stack
	stack stack = new stack();
	
	stack.value[0] = "muhammad gazali";
	stack.value[1] = "hasbi";
	stack.value[2]= "gazali";
	stack.value[3]= "wira";
	stack.setvalueAt(4 ,"rusman");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}
