package General;
	import java.util.ArrayList;
	 
	public class CirAList<Generic>
	{
		private ArrayList<Generic> a;
	 
		public CirAList()
		{
			this.a = new ArrayList<Generic>();
		}
	 
		public CirAList(Generic first)
		{
			this.a = new ArrayList<Generic>();
			this.a.add(first);
		}
	 
		public CirAList(Generic[] first)
		{
			this.a = new ArrayList<Generic>();
			for (Generic temp : first)
				this.a.add(temp);
		}
	 
		public void add(Generic o)
		{
			this.a.add(o);
		}
	 
		public Generic get(int index)
		{
			if (this.a.size() == 0)
				return null;
			return this.a.get(index % this.a.size());
		}
	 
		public void set(int index, Generic o)
		{
			if (this.a.size() == 0)
				return;
			this.a.set(index % this.a.size(), o);
		}
		
		public void swap(int index1, int index2)
		{
			Generic temp=get(index2);
			set(index2, get(index1));
			set(index1, temp);
		}
	 
		public String toString()
		{
			String st = "[";
			if (this.a.size() != 0)
				st += this.a.get(0).toString();
			else
				return "[Empty]";
			for (int i = 1; i < this.a.size(); i++)
				st += ", " + this.a.get(i).toString();
			st += "]";
			return st;
		}
	 
		public static void main(String[] args)
		{
			CirAList<Integer> test = new CircularArrayList<Integer>(new Integer[]{ 0, 1, 2 });
			System.out.println(test.toString());
			test.swap(0, 2);
			System.out.println(test.toString());
			test.swap(0, 3);
			System.out.println(test.toString());
		}
	}
