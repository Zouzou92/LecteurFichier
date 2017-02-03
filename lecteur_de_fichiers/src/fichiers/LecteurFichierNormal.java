package fichiers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecteurFichierNormal extends LecteurFichier implements Lecteur {
	
	public LecteurFichierNormal(String chemin) {
		super(chemin);
	}
	
	public void lire(){
		try {
			super.lecteur = new FileReader(super.fichier);
			int i = 0;
			while((i = super.lecteur.read()) != -1) {
				super.contenu += (char)i;
			}
		} catch (FileNotFoundException e) {
			System.out.println("On ne peut pas lire le fichier car celui-ci n'existe pas");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
