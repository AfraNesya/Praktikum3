public class PegawaiBeraksi {
	public static void main(String[] args){
		//Membuat object
                Programmer antonBonus = new Programmer();
		Manager anton = new Manager();

		
		/* memanggil atribut dan memberi nilai */
		anton.nama = "Anton Suranton";
		anton.gajiPokok = 4500000;
		anton.tunjangan = 2500000;
                antonBonus.bonus= 1500000;

		
		anton.cetakInfo();
		anton.cetakTunjangan();
                antonBonus.cetakBonus();
	}
}