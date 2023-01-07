package mypack;

public class TestProduit {
	public static void main (String [] args) {
	Livre livre1=new Livre("Le Prophete","Gibrane Khalil Gibrane","Editeur", 12500);
	
	String tracks[]={"Chonson1","Chonson2","Chonson3"};
	CD cd1=new CD("Les Moulins de Mon Coeur","Frida Boccara",tracks, 2450);

	
	System.out.println(livre1.toString()) ;
	System.out.println("-----------------------------------------------------");
	System.out.println(cd1.toString());

}


}
