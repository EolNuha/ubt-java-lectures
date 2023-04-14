public class Fakulteti{
	public String drejtimi;
	public Mesimdhenesi[] vargu;
	int index = 0;
	
	/*
		1.2.1.	Ofroni konstruktorin e kësaj klase, i 
		cili pranon drejtimin si dhe numrin e mësimdhënësve 
		të fakultetit.  
	*/
	public Fakulteti(String d, int kapaciteti){
		drejtimi = d;
		vargu = new Mesimdhenesi[kapaciteti];
	}
	
	/*
	1.2.2.	Ofroni metodën ekziston e cila tregon nëse në mësimdhënës 
	jep mësim në fakultet.Mësimdhënësi ti dërgohet metodës si parametër. 
	*/
								// Sefedini 2002
		public boolean ekziston(Mesimdhenesi m){
			/*
				vargu[0] = Altina 2002 
				vargu[1] = Ylli
				vargu[2] = Fisi
				vargu[3] = Sefedini 2002
			*/
			for(int i = 0; i < index; i++){
				if(vargu[i].equals(m)){
					return true;
				}	
			}
			return false;	
		}
	/*
		1.2.3.	Ofroni metodën shtoMesimdhenesin 
		që e shton një mësimdhënës në varg nëse ai veç 
		se nuk ekziston dhe ka vend në varg. 
	*/
		
		public void shtoMesimdhenesin(Mesimdhenesi m){
			if( m == null){
				System.out.println("Mesimdhenesi nuk eshte inicializuar");
				return;
			}
			if(ekziston(m)){
				System.out.println("Mesimdhenesi ekziston");
				return;
			}
			if(index >= vargu.length){
				System.out.println("Nuk ka vend te lire ne varg");
				return;
			}
			vargu[index++] = m;
		}
		
	/*
	1.2.4.	Ofroni metodën mesimdhenesiMeIRi 
	që e kthen mësimdhënës in më të ri në fakultet. 
	Nëse ka shumë se një mësimdhënës më të ri me vit 
	të lindjes të njëjtë, të kthehet mësimdhënësi i parë 
	që e plotëson kushtin. 

	*/
	
	public Mesimdhenesi mesimdhenesiMeIRi(){
		 //Mesimdhenesi iRi = vargu[0];
		 Mesimdhenesi iRi = null;
		 
		 for(int i = 0; i < index; i++){
			 /*
				vargu[0] = Altina 2002 
				vargu[1] = Ylli 2001
				vargu[2] = Fisi 2003
				vargu[3] = Sefedini 2002
			*/
			 if(iRi == null || vargu[i].getVitiLindjes() > iRi.getVitiLindjes()){
				 iRi = vargu[i];
			 }
		 }
		return iRi;
	}
	
	/*
		1.2.5.	Ofroni metodën ktheAngazhimet që kthen mësimdhënësit 
		që kanë angazhim të caktuar. Angazhimi ti dërgohet metodës 
		si parametër. Nëse nuk ka asnjë mësimdhënës që ka angazhimin 
		i cili dërgohet si parametër, të kthehet një vlerë null. 
	
	*/
		public Mesimdhenesi[] ktheAngazhimet(String a){
			
			int count = 0;
			for(int i = 0; i < index; i++){
				if(vargu[i].getAngazhimi().equals(a)){
					count++;
				}
			}
			if(count == 0){
				return null;
			}
			Mesimdhenesi[] v = new Mesimdhenesi[count];
			int temp = 0;
			for(int i = 0; i < index; i++){
				if(vargu[i].getAngazhimi().equals(a)){
					v[temp++] = vargu[i];
				}
			}
			return v;
		}

	public static void main(String[]args){
		Fakulteti f = new Fakulteti("Shkenca Kompjuterike", 10);
		Mesimdhenesi m1 = new Mesimdhenesi("Altina", 2002, "Profesor");
		Mesimdhenesi m2 = new Mesimdhenesi("Aurora", 2002, "Asistent");
		Mesimdhenesi m3 = new Mesimdhenesi("Fisi", 2002, "Profesor");
		Mesimdhenesi m4 = new Mesimdhenesi("Sefedin", 2004, "Profesor");
		f.shtoMesimdhenesin(m1);
		f.shtoMesimdhenesin(m2);
		f.shtoMesimdhenesin(m3);
		f.shtoMesimdhenesin(m4);
		f.shtoMesimdhenesin(m4);
		
		System.out.println();
		System.out.println("Mesimdhenesi me i ri : " + f.mesimdhenesiMeIRi());
		System.out.println();
		
		Mesimdhenesi[] temp = f.ktheAngazhimet("Profesor");
		for(Mesimdhenesi m : temp){
			System.out.println(m.toString());
		}

	}

}