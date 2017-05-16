public class carsCard extends card{
	
	private int cost;
	
	public carsCard(String a, float b , float c, int p){
	super(a, b, c)
    cost = p;
	}
	
	public int getCost(){
		return cost;
	}
	
}
