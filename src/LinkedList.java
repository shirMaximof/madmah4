import java.util.Iterator;

public class LinkedList<T> implements List<T> {
	private Link<T> first;
	private Link<T> last;

	public LinkedList(){
		first = null;
		last = null;
	}

	public void sortBy(int[]arr) {
	int size = arr.length;
	for(int i=1;i<size;i++) {
		int k = arr[i];
		int j= i-1;
		while(j>=0 && arr[j]>k) {
			arr[j+1] = arr[j];
			j--;	
		}
		arr[j+1] = k;
	}
	
	}
	public void sortBy(Comparator<T> comp){
		if(comp==null)
			throw new NullPointerException("comparator is null");
		Link<T> curr = first;
		Link<T> next = curr.getNext();
		if(next!=null) 
		{
		int i = 1;
		int size = size();
		while(i<size) {
			int j = i-1;
			while(j>=0 && comp.compare(next.getData(),get(j))>0 ) {
				
				
				
				j--;
			}
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
//		
//		if(curr!=null) {
//			val=curr.getData();
//			curr=curr.getNext();
//		}
//		int size = size();
//		for(int i=1;i<size;i++) {
//			if(i!=1)
//				val = curr.getData();
//			int j=i-1;		
//			for(;j>=0 && comp.compare(curr.getData(), val)>0;j--)
//			{
//				T save = set(i,)
//			
//				
//			
//			
//		}
//			T val = set(j+1,curr.getData());
//			
//					
//			curr = curr.getNext();
//		}
	
	
	}


	public String toString() {
		Iterator<T> iter = this.iterator();
		String ans= "";
		while(iter.hasNext())
		{
			ans = ans+"<"+iter.next().toString()+"> ";
						
		}
		return ans;
	}

	public boolean equals(Object other) {  
		if(other==null)
			throw new IllegalArgumentException("object cant be null");
		if(!(other instanceof LinkedList))
			return false;
		if(((LinkedList<T>)other).size()!=(this.size()))
			return false;
		Iterator<T> iter_other = ((LinkedList<T>)other).iterator();
		Iterator<T> iter_this = this.iterator();
		while(iter_other.hasNext()) {
			if(!(iter_other.next().equals(iter_this.next())))
					return false;
		}
		return true;
	}

	public void add(int index, T element) {
		rangeCheck(index);
		nullCheck(element);
		if(index == 0) {
			first = new Link(element, first) ;
			if(last == null)
				last = first ;
		} else {
			Link<T> prev = null ;
			Link<T> curr = first ;
			for(int i=0; i<index; i=i+1) {
				prev = curr ;
				curr = curr.getNext() ;
			}
			Link<T> toAdd = new Link(element, curr);
			prev.setNext(toAdd);
			if(index == size())
				last = toAdd;
		}
	}

	public void add(T element) {
		nullCheck(element);
		if(isEmpty()){
			first = new Link<T>(element);
			last = first;
		}
		else {
			Link<T> newLast = new Link<T>(element);
			last.setNext(newLast);
			last = newLast;
		}
	}

	@Override
	public int size() {
		int size =0;
		Iterator<T> iter = this.iterator();
		while(iter.hasNext())
		{
			size++;
			iter.next();
		}
		return size;
	}

	@Override
	public boolean contains(T element) {
		
		boolean found = false;
		Iterator<T> iter = this.iterator();
		while(iter.hasNext() && !found)
		{
			if(iter.next().equals(element))
				found = true;
		}
		return found;
		
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

	@Override
	public T get(int index) {
		rangeCheck(index);
		T val;
		Link<T> temp = first;
		while(index>0) {
			temp = temp.getNext();
			index--;
		}
		val = temp.getData();
		return val;
			
	}


	@Override
	public T set(int index, T element) {
		rangeCheck(index);
		nullCheck(element);
		
		Link<T> curr = first;
		while(index>0) {
			 curr = curr.getNext();
			index--;
		}
		T dataToGarbage= curr.getData();
		curr.setData(element);
		
		return dataToGarbage;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(first);
	}

	// throws an exception if the given index is not in range
	private void rangeCheck(int index) {
		if(index < 0 || index >= size())
	        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
	}
	
	// throws an exception if the given element is null
	private void nullCheck(Object element){
		if (element == null)
			throw new NullPointerException();
	}

}
