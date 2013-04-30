package brain;
import java.util.ArrayList;

public class Neuron {
	private NeuroType type;
	private Location place;
	private Axon[] axons;
	private ArrayList<Neuron> conNode;
	private ArrayList<Integer> conStren;
	private int Thresh;
	private int Volt;
	private int Voltchange;
	private int TimeLastChecked;
	public Neuron(Location P, NeuroType T)
	{
		type= T;
		place=P;
		int a=(int)T.GetValue(5);
		axons=new Axon[a];
		for (int i=0; i<a; i++)
			axons[i]=new Axon(T,P,i);
		
	}
	
}
