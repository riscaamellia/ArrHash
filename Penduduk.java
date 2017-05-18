package Project;

public class Penduduk {

	int Nip;
	String Nama;
	String tempatLahir;
	int tglLahir;
	String Alamat;
	String Agama;
	String Pekerjaan;

	
	
	public Penduduk() {
	}
	public int getNip() {
		return Nip;
	}
	public String getNama() {
		return Nama;
	}
	public String getTempatLahir() {
		return tempatLahir;
	}
	public int getTglLahir() {
		return tglLahir;
	}
	public String getAlamat() {
		return Alamat;
	}
	public String getAgama() {
		return Agama;
	}
	public String getPekerjaan() {
		return Pekerjaan;
	}
	public void setNip(int nip) {
		Nip = nip;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
	public void setTglLahir(int tglLahir) {
		this.tglLahir = tglLahir;
	}
	public void setAlamat(String alamat) {
		Alamat = alamat;
	}
	
	public void setAgama(String agama) {
		Agama = agama;
	}
	public void setPekerjaan(String pekerjaan) {
		Pekerjaan = pekerjaan;
	}
	
	
}
