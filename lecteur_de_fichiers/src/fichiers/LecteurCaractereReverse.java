package fichiers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecteurCaractereReverse extends LecteurFichier implements Lecteur {
	private String reverse;
	
	public LecteurCaractereReverse(String chemin) {
		super(chemin);
		reverse = "";
	}
	
	public void lire() {
		try {
			// Le d�but est pareil que la m�thode lire() de la classe LecteurFichierNormal
			super.lecteur = new FileReader(super.fichier);
			int i = 0;
			while((i = super.lecteur.read()) != -1) {
				super.contenu += (char)i;
			}
			// Ici, on parcourt la propri�t� contenu � l'envers pour la stocker dans la propri�t� reverse
			for(i=super.contenu.length()-1;i>=0;i--) {
				this.reverse += super.contenu.charAt(i);
			}
			// Une fois la propri�t� reverse remplie, on la r�injecte dans la propri�t� contenu
			super.contenu = this.reverse;
			
		} catch (FileNotFoundException e) {
			System.out.println("On ne peut pas lire le fichier car celui-ci n'existe pas");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
