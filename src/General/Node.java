package General;

public class Node {
private Node Next;
private Object value;
public Node(){
}
public void SetO(Object newO){
	value=newO;
}
public void SetNext(Node newN){
	Next=newN;
}
public Object GetValue(){
	return value;
}
public Node GetNext(){
	return Next;
}
public void delete(){
 value=null;
 Next=null;
}
}
