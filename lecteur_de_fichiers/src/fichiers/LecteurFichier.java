package fichiers;

import java.io.File;
import java.io.FileReader;

abstract class LecteurFichier implements Lecteur {
	
	protected File fichier; // La propriété qui contient le chemin vers le fichier
	protected FileReader lecteur;
	protected String contenu;
	
	public LecteurFichier(String chemin) {
		// Le constructeur initialise la propriété fichier avec le chemin passé en paramètre
		this.fichier = new File(chemin);
		this.contenu = "";
	}
	
	public void ouvrir() {
		// Si le fichier existe, on renvoie true, sinon on renvoie false
		if(this.fichier.exists()) {
			System.out.println("Le fichier est présent");
		}
		else {
			System.out.println("Le fichier n'existe pas");
		}
	}
	
	abstract void lire();
	
	public void affiche(){
		System.out.println(this.contenu);
	}
}
