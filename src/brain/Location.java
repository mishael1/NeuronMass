package brain;


public class Location {
private int[] x;
private int[] dir;
//dir is set as a (normalised) x y z vector
public Location (int x, int y, int z){
	this.x=new int[3];
	this.x[0]=x;
	this.x[1]=y; 
	this.x[2]=z;
	this.dir=new int[3];
	dir[0]=0;
	dir[1]=0;
	dir[2]=0;
}
public Location (Location P)
{
	this.x=new int[3];
	x[0]=P.GetPlace()[0];
	x[1]=P.GetPlace()[1];
	x[2]=P.GetPlace()[2];
	this.dir=new int[3];
	dir[0]=P.GetDirection()[0];
	dir[1]=P.GetDirection()[1];
	dir[2]=P.GetDirection()[2];
}
public void Move(int a, int b, int c){
	x[0]+=a;
	x[1]+=b;
	x[2]+=c;
}
public void setDir(int[] p)
{
	for (int i=0; i<3; i++)
		dir[i]=p[i];
}
public int[] GetPlace()
{
	return x;
}
public int[] GetDirection()
{
	return dir;
}
}
