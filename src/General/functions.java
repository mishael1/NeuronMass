package General;

public class functions {
	public static double tannusA(double d,double e)
	{
		return (d*((Math.tan((2*Math.random()-1)*e))/(Math.tan(e))+1));
	}
	public static double tannusB(double d,double e)
	{
		return (d*((Math.tan((2*Math.random()-1)*e))/(Math.tan(e))));
	}
	public static double normalDis(double d,double e)
	{
		return (d+e*Math.sqrt(-2*Math.log(Math.random()))*Math.sin(2*Math.PI*Math.random()));
	}
	public static void main(String[] args) {
		for(int i=1; i<20; i++)
		System.out.println(normalDis(1000.0,100));
	}
	
}
