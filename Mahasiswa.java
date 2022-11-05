public class Mahasiswa extends Manusia {
	String nim;
	String jurusan;

	public void setnim(String nim) {
		this.nim = nim;
	}
	public String getnim(){
		return this.nim;
	}
	
	public void setjurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getjurusan(){
		return this.jurusan;
	}
	
	public void cetakInfo2() {
        System.out.println("NIM             : " + this.nim);
        System.out.println("Jurusan         : " + this.jurusan);
    }
}
