public class MahasiswaBeraksi {
	public static void main(String[] args){
		// Membuat object
		Mahasiswa anton = new Mahasiswa();
		
		
		/* memanggil atribut dan memberi nilai */

		anton.setnim ("10102020");
		anton.setnama ("Anton Santoso");
		anton.setjenisKelamin ("Laki-laki");
		anton.setumur (28);
		anton.setalamat ("Bekasi Kota");
		anton.setjurusan ("Informatika");
                
		anton.cetakInfo();
                anton.cetakInfo2();
		}

}