/*package fichiers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecteurLigneReverse extends LecteurFichier implements Lecteur {
	private String line;
	
	public LecteurLigneReverse(String chemin) {
		super(chemin);
		line ="";
	}
	
	public void lire() {
		try {
			super.lecteur = new FileReader(super.fichier);
			int i = 0;
			while((i = super.lecteur.read()) != -1) {
				super.contenu += (char)i;
			}
			// Pour compter le nombre de ligne
			int compteur = 0;
			char c;
			for(i=0;i<super.contenu.length();i++) {
				c = super.contenu.charAt(i);
				if(c == '\n') {
					compteur++;
				}
				
				
			}
			String melangeur[] = new String[compteur+1];
			int j;
			int indexJ=0;
			for(i=compteur;i>=0;i--) {
				for(j=indexJ;j<super.contenu.length();j++) {
					melangeur[i] += super.contenu.charAt(j);
					if(super.contenu.charAt(j) == '\n') {
						indexJ = j;
						j = super.contenu.length();
					}
				}
			}
			for(i=0;i<compteur;i++) {
				line += melangeur[i];
			}
			super.contenu = line;
			
		} catch (FileNotFoundException e) {
			System.out.println("On ne peut pas lire le fichier car celui-ci n'existe pas");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
*/