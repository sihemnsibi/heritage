package mypack;

public class CD extends Produit {
	private String titre;
	private String interprete;
	private String ListeTitre[];
	
    public CD(String titre, String interprete, String ListeTitre[], float prix) {
    	super(prix);
    	this.titre=titre;
    	this.interprete=interprete;
    	this.ListeTitre=ListeTitre;
    }
    
    
    public void setTitre(String titre) {
    	this.titre=titre;
    	}
    public void setInterprete(String interprete)	{
    	this.interprete=interprete;
    	}
    public void setListeTitre(String ListeTitre[]) 	{
    	this.ListeTitre=ListeTitre;	
    	}
    
    public String getTitre() {
    	return titre;	
    	}
    public String getInterprete() 	{ 
    	return interprete;
    	}
    public String[] getListeTitre() {
    	return ListeTitre; 	
    	}
    public String toString() {
    	super.setService("CD");
    	String liste="";
    	for(int i=0;i<ListeTitre.length;i++)
    		liste+="\n -->"+ListeTitre[i];
    	return "Titre: "+titre+"\nInterprete: "+interprete+"\nListe des consons: "+liste+"\nAutre: "+super.toString();
    }

}
