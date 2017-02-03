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
			// Le début est pareil que la méthode lire() de la classe LecteurFichierNormal
			super.lecteur = new FileReader(super.fichier);
			int i = 0;
			while((i = super.lecteur.read()) != -1) {
				super.contenu += (char)i;
			}
			// Ici, on parcourt la propriété contenu à l'envers pour la stocker dans la propriété reverse
			for(i=super.contenu.length()-1;i>=0;i--) {
				this.reverse += super.contenu.charAt(i);
			}
			// Une fois la propriété reverse remplie, on la réinjecte dans la propriété contenu
			super.contenu = this.reverse;
			
		} catch (FileNotFoundException e) {
			System.out.println("On ne peut pas lire le fichier car celui-ci n'existe pas");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
