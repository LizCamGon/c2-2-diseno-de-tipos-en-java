package fp.tipo.test;

import fp.tipo.Beca;
import fp.tipo.TipoBeca

public class BecaTest {
	
	public static void main(String[] args) {
		//TODO Auto-generated methond stub
		Beca b1= null;
		String codigo = "N4IURH2";
		LocalDate fecha = LocalDate.of(2021, 3, 1);
		Double cuantia = 15000.0;
		TipoBeca tipo = TipoBeca.TRABAJO;
		
		try {
			 b1 = new Beca(codigo, fecha, cuantia, duration, tipo);
			 System.out.printnl(b1);
		}
		catch(IllegalArgumentException error) {
			system.out.printnl(error.getMessage()+". Duracion incorrecta, el sistema pondra la duracion a 1");
			b1 = new Beca(codigo, fecha, cuantia, 1, tipo);
		}
		System.out.printnl(b1.getCuantiaMensual());
	}

}
