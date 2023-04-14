public class Mesimdhenesi{
	// emer, mbiemer, fakultet, lenda....
	// Atribute
	public String emri;
	public String mbiemri;
	public String fakulteti;
	public String lenda;
	public int mosha;
	
	// konstruktori;
	// Mesimdhenesi m = new Mesimdhenesi();
	public Mesimdhenesi(){	
	}
	// Mesimdhenesi ligjeruesiSHKI = new Mesimdhenesi("Lavdim","Menxhiqi","SHKI","Shkenca Kompjuterike 1", 31);
	public Mesimdhenesi(String e, String m, String f, String l, int mo){
		emri = e;
		mbiemri = m;
		fakulteti = f;
		lenda = l;
		mosha = mo;
	}
	
	// metodat get dhe set
	public void setEmri(String e){ // Bertan
		emri = e; // Bertan
	}
	
	public String getEmri(){
		return emri;
	}
	
	public void setMbiemri(String m){
		mbiemri = m;
	}
	public String getMbiemri(){
		return mbiemri;
	}
	
	public void setFakulteti(String f){
		fakulteti = f;
	}
	public String getFakulteti(){
		return fakulteti;
	}
	public void setLenda(String l){
		lenda = l;
	}
	public String getLenda(){
		return lenda;
	}
	public void setMosha(int m){
		mosha = m;
	}
	public int getMosha(){
		return mosha;
	}
	
	// Nje metode qe reprezenton nje objekt ne String
	public String toString(){
		return "emri : " + emri
		+ "\n mbiemri : " + mbiemri
		+ "\n fakulteti : " + fakulteti
		+ "\n lenda : " + lenda
		+ "\n mosha : " + mosha;
	}
	
}
