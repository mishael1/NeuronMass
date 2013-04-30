package General;


public class CirMem
{
	private int num;
	private Node first;
	public CirMem(Object t){
		first=new Node();
		first.SetO(t);
		first.SetNext(first);
		num=1;
	}
	public void Insert(Object t){
		Node newN=new Node();
		newN.SetO(t);
		newN.SetNext(first.GetNext());
		first.SetNext(newN);
		num++;
	}
	public void Next(){
		first=first.GetNext();
	}
	public void Jump2(){
		first=first.GetNext().GetNext();
	}
	public void JumpN(int N){
		for(int i=0; i<N; i++)
			first=first.GetNext();
	}
	public Object GetValue(){
		return first.GetValue();
	}
	public int GetNum(){
		return num;
	}
	public void Replace(Object t){
		first.SetO(t);
	}
	public void RemoveNext()
	{
		Node second=first.GetNext();
		first.SetNext(second.GetNext());
		second.delete();
	}
}
