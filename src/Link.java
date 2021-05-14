
public class Link<T> {
	private T data;
	private Link<T> next;
	public Link(T data, Link next){
		this.data = data;
		this.next = next;
	}
	public Link(T data){
		this(data, null);
	}
	public T getData(){
		return data;
	}
	public Link<T> getNext(){
		return next; 
	}
	public void setNext(Link next){
		this.next = next;
	}
	public T setData(T data){
		T tmp = this.data;
		this.data = data; 
		return tmp;
	}
	public boolean equals(Object other) {  
		if(other instanceof Link)
			return ((Link<?>)other).getData().equals(this.data);
		return false;
		
	}
	public String toString(){
		return data.toString();
	}

	


}
