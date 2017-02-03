package fichiers;

public class Test{

	public static void main(String[] args) {
		// Test lecture classique
		
		System.out.println("Lecture classique : \n");
		
		LecteurFichier classique = new LecteurFichierNormal("test.txt");
		classique.ouvrir();
		classique.lire();
		classique.affiche();
		
		System.out.println("\n\n__________________________\n\nLecture caract�res � l'envers");
		
		LecteurFichier backwards = new LecteurCaractereReverse("test.txt");
		backwards.ouvrir();
		backwards.lire();
		backwards.affiche();
		/*
		System.out.println("\n\n__________________________\n\nLecture lignes � l'envers");
		
		LecteurFichier ligne = new LecteurLigneReverse("test.txt");
		ligne.ouvrir();
		ligne.lire();
		ligne.affiche();*/
	}

}
