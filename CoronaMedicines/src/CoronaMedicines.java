import America.*;
import India.*;
import Russia.*;

public class CoronaMedicines {

	public static void main(String[] args) {
		
		System.out.println("The Corona Vaccines Available and Its Effectivenes\n ");
		BharathBiotech i1 = new BharathBiotech();
		Serum i2 = new Serum();
		AstraZeneca r = new AstraZeneca();
		BioNTech a = new BioNTech();
		
		System.out.println("INDIAN VACCINES ");
		i1.IndianVaccine1();
		i2.IndianVaccine2();
		System.out.println("RUSSIAN VACCINE ");
		r.RussianVaccine();
		System.out.println("AMERICAN VACCINE ");
		a.AmericanVaccine();
		
		
		

	}

}
