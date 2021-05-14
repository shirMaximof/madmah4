import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator<T> implements Iterator<T> {

private Link<T> nextLink ;
	
	public LinkedListIterator(Link<T> start) {
		nextLink = start ;
	}

	@Override
	public boolean hasNext() {
		return nextLink != null ;
	}

	@Override
	public T next() {
		if(!hasNext())
			throw new NoSuchElementException();
		
		T nextElement = nextLink.getData() ;
		nextLink = nextLink.getNext() ;
		return nextElement ;
	}
}