package ua.bondar;

public class LinkedList<T> {
	private T element;
	private LinkedList next;
	
	public LinkedList(T element, LinkedList next ) {
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public LinkedList getNext() {
		return next;
	}

	public static <T> LinkedList<T> reverse(final LinkedList<T> original)  {
	    if (original == null) {
	        throw new NullPointerException("Cannot reverse a null list");
	    }

	    
	    if(original.getNext() == null) {
	        return original;
	    }
	    
	    final LinkedList<T> next = original.next;
	    original.next = null;

	    final LinkedList<T> othersReversed = reverse(next);

	    next.next = original;

	    return othersReversed;
	}
	
//	public static <T> LinkedList<T> reverseShort(final LinkedList<T> original)  {
//	    if (original == null) {
//	        throw new NullPointerException("Cannot reverse a null list");
//	    }
//	    if (original.next == null)
//	    	return original;
//	    	
//	    LinkedList<T> current = original;
//	    do {
//	    	if (current == original) 
//		    	  original.next = null;
//
//	    	final LinkedList<T> next = current.next;
//	    	final LinkedList<T> tmp = next.next;
//	    	next.next = current;
//		    current = tmp;	   
//	    } while (current.getNext() != null);
//	     {
//	    	
////	    	if (previous == original)
////	    	  original.next = null;
////	    	next.next = previous;
////	    	previous = next;
//	    }
//	    
////	    if(original.getNext() == null) {
////	        return original;
////	    }
////	    
////	    final LinkedList<T> next = original.next;
////	    original.next = null;
////
////	    final LinkedList<T> othersReversed = reverse(next);
////
////	    next.next = original;
////
//	    return previous;
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
