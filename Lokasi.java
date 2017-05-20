package Project;

import java.util.Scanner;

public class Lokasi {
	String Nama;
    String JenisKelamin;
    String Kota;
    String Kec;
    String Desa;
    String RT;

    public Lokasi(){
	
    }
    
    public Lokasi(String nama, String jenisKelamin, String kota, String kec, String desa, String rT) {
    	super();
        Nama = nama;
        JenisKelamin = jenisKelamin;
        Kota = kota;
        Kec = kec;
        Desa = desa;
        RT = rT;
    }
    
    public Lokasi(String kota, String kec, String desa, String rT) {
	super();
		Kota = kota;
		Kec = kec;
		Desa = desa;
		RT = rT;
    }
    public Lokasi(String kota, String kec, String desa) {
    	super();
		Kota = kota;
		Kec = kec;
		Desa = desa;
    }
    public Lokasi(String desa, String rT) {
    	super();
    	Desa = desa;
    	RT = rT;
    }

    public String getNama() {
        return Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    
    
    public String getKota() {
    	return Kota;
    }
    public String getKec() {
    	return Kec;
    }
    public String getDesa() {
    	return Desa;
    }
    public String getRT() {
    	return RT;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJenisKelamin(String JenisKelamin) {
    	this.JenisKelamin = JenisKelamin;
    }
    
    
    
    public void setKota(String kota) {
    	Kota = kota;
    }
    public void setKec(String kec) {
    	Kec = kec;
    }
    public void setDesa(String desa) {
    	Desa = desa;
    }
    public void setRT(String rT) {
    	RT = rT;
    }


}
