package ua.bondar;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestReverseLinkedList() {
		
        final LinkedList<String> three = new LinkedList<>("3", null);
        final LinkedList<String> two = new LinkedList<>("2", three);
        final LinkedList<String> one = new LinkedList<>("1", two);

        final LinkedList<String> reversed = LinkedList.reverse(one);

        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
	}

	@Test
	public void TestReverseShort() {
        final LinkedList<String> three = new LinkedList<>("3", null);
        final LinkedList<String> two = new LinkedList<>("2", three);
        final LinkedList<String> one = new LinkedList<>("1", two);

        final LinkedList<String> reversed = LinkedList.reverse(one);

        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
		
	}
}
