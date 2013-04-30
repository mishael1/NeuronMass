package brain;

public class NeuroType 
{
//0 neuron type
//1private int conAvgSten;
//2private int conIniNum;
//3private int exonLength;
//8 exon length distribution
//9 exon size distrinution
//4private int exonSize;
//5private int exonNum;
//6private int iniThreshIn;
//7private int iniThreshOut;	
//public NeuroType(int conA, int conI, int exonL, int exonR, int exonN, int iniTI, int iniTO)	{
	private double[] properties;
	public NeuroType(double[] a)
	{
		properties=a;
	}
	public double GetValue(int i)
	{
		return properties[i];
	}
	public void SetValue(int i,double v)
	{
		properties[i]=v;
	}
	public void Print()
	{
		System.out.println("conAvgSten 1");
	}
}