package mypack;

public class Livre extends Produit {
	private String titre;
	private String auteur;
	private String editeur;
	
    public Livre(String titre, String auteur, String editeur, float prix) {
    	super(prix);
    	this.titre=titre;
    	this.auteur=auteur;
    	this.editeur=editeur;
    }
    
    
    public void setTitre(String titre) 		{ 
    	this.titre=titre;	
    	}
    public void setAuteur(String auteur)	{ 
    	this.auteur=auteur;
    	}
    public void setEditeur(String editeur) 	{ 
    	this.editeur=editeur;	
    	}
    
    
    public String getTitre() 		{
    	return titre; 
    	}
    public String getAuteur() 		{ 
    	return auteur;
    	}
    public String getEditeur() 		{
    	return editeur;
    	}
    
    
    public String toString() {
    	super.setService("Livre");
    	return "Titre: "+titre+"\nAuteur: "+auteur+"\nEditeur: "+editeur+"\nAutre: "+super.toString();
    }

}
