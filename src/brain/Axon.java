package brain;
import General.functions;
public class Axon {
	private Location Place;
	private int size;
	public Axon(NeuroType T, Location P, int i)
	{
		double d=functions.tannusA(T.GetValue(3), T.GetValue(8));
		size=(int)functions.tannusA(T.GetValue(4), T.GetValue(9));
		Location n=new Location(P);
		int[] chandeDir c=
		int[] dir=P.GetDirection();
		
		
	}
}
