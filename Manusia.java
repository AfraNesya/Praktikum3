public class Manusia {
	String nama;
	String jenisKelamin;
	int umur;
	String alamat;
	
	public void setnama(String nama) {
		this.nama = nama;
	}
	public String getnama(){
		return this.nama;
	}

	
	public void setjenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getjenisKelamin(){
		return this.jenisKelamin;
	}
	
	
	public void setumur(int umur) {
		this.umur = umur;
	}
	public int getumur(){
		return this.umur;
	}
	
	
	public void setalamat(String alamat) {
		this.alamat = alamat;
	}
	public String getalamat(){
		return this.alamat;
	}
	
	public void cetakInfo() {
        System.out.println("Nama            : " + this.nama);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Umur            : " + this.umur);
        System.out.println("Alamat          : " + this.alamat);
    }
}