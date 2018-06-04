package interview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.junit.Test;

public class LinkedHashMapTest {
	


    @Test
    public void showLinkedHashmapProperties() {
    	
    	final Boolean isExists;
        final LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "ten");
        linkedHashMap.put(20, "twenty");
        linkedHashMap.put(30, "thirty");
        linkedHashMap.put(40, "forty");
        linkedHashMap.put(50, "fifty");

        // works like a map
        assertEquals("fifty", linkedHashMap.get(50));
        
        // Respects insertion order
        final Iterator<Integer> keyIterator = linkedHashMap.keySet().iterator();
        
    assertEquals("ten",   linkedHashMap.get(keyIterator.next()));
    assertEquals("twenty",   linkedHashMap.get(keyIterator.next()));
    assertEquals("thirty", linkedHashMap.get(keyIterator.next()));
    assertEquals("forty",  linkedHashMap.get(keyIterator.next()));
    assertEquals("fifty",  linkedHashMap.get(keyIterator.next()));

    // The same is not true for HashMap
    final HashMap<Integer, String> regularHashMap = new HashMap<>();
    regularHashMap.put(10, "ten");
    regularHashMap.put(20, "twenty");
    regularHashMap.put(30, "thirty");
    regularHashMap.put(40, "forty");
    regularHashMap.put(50, "fifty");


    final ArrayList hashMapValues = new ArrayList<>(regularHashMap.values());
    final ArrayList linkedHashMapValues = new ArrayList<>(linkedHashMap.values());
    
    System.out.println(hashMapValues);
    System.out.println(linkedHashMapValues);
    

    // the lists will have the same values, but in a different order
    assertFalse(linkedHashMapValues.equals(hashMapValues));
    assertFalse(linkedHashMapValues.equals(linkedHashMap));
    }

}
