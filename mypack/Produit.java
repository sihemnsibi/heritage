package mypack;

public class Produit {
	private float prix;
	private final float tva= 19.6f;
	private String service;

    public Produit(float prix) {
    	this.prix=prix;
    }
    public void setPrix(int prix) {
    	this.prix=prix;
    }
    
    public void setService(String service) {
    	this.service=service;
    }
    
    public float getPrix() 	{ 
    	return (prix*tva/100);
    	}
    public String getService() 		{ 
    	return service; 
    	}
    
    
    public String toString() {
    	return "Prix : "+getPrix()+" Tva : "+tva+" Type :  "+service;
    }

}
