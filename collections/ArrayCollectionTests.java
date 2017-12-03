package collections;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayCollectionTests {
    private ICollection collection = new ArrayCollection();

    @Test
    public void addOneElement() {
        assertEquals(0, collection.size());
        int element = 3;
        collection.add(element);

        assertTrue(collection.contains(element));
        assertEquals(1, collection.size());
        assertEquals(element, collection.elementAt(0));
    }

    @Test
    public void addTwoElementsRemoveOne() {
        int element1 = 3;
        int element2 = 4;

        collection.add(element1);
        collection.add(element2);

        assertTrue(collection.contains(element1));
        assertTrue(collection.contains(element2));

        assertEquals(2, collection.size());

        collection.remove(element1);

        assertFalse(collection.contains(element1));
        assertEquals(1, collection.size());
    }

    @Test
    public void addTwoElementsAndRemoveOne() {

        int element1 = 3;
        int element2 = 7;

        collection.add(element1);
        collection.add(element2);

        assertTrue(collection.contains(element1));
        assertTrue(collection.contains(element2));
        assertEquals(2, collection.size());

        collection.remove(element1);

        assertFalse(collection.contains(element1));
        assertTrue(collection.contains(element2));
        assertEquals(1, collection.size());
    }

    /**
     * Adds an object to the collection and removes it.
     */
    @Test
    public void addThreeElementsAndRemoveTwoWithTwoSame() {

        int element1 = 3;
        int element2 = 7;

        collection.add(element1);
        collection.add(element2);
        collection.add(element1);

        assertTrue(collection.contains(element1));
        assertTrue(collection.contains(element2));
        assertEquals(3, collection.size());

        collection.remove(element1);

        assertTrue(collection.contains(element1));
        assertTrue(collection.contains(element2));
        assertEquals(2, collection.size());

        collection.remove(element1);

        assertFalse(collection.contains(element1));
        assertTrue(collection.contains(element2));
        assertEquals(1, collection.size());
    }

    @Test(expected=IllegalStateException.class)
    public void addTooMany() {

        collection = new ArrayCollection(2);

        collection.add(5);
        collection.add(6);
        collection.add(7);
    }

    @Test
    public void getElementZero() {

        int element = 3;

        collection.add(element);

        assertEquals(element, collection.elementAt(0));
    }

    @Test
    public void getElementOne() {

        int element1 = 3;
        int element2 = 7;

        collection.add(element1);
        collection.add(element2);

        assertTrue(collection.elementAt(0).equals(element1) ^ collection.elementAt(1).equals(element1));
        assertTrue(collection.elementAt(0).equals(element2) ^ collection.elementAt(1).equals(element2));
    }

    @Test(expected=IllegalArgumentException.class)
    public void getElementOutOfBounds() {

        collection.add(3);
        collection.elementAt(1);
    }

    @Test
    public void removeAll() {

        int element1 = 3;
        int element2 = 7;

        collection.add(element1);
        collection.add(element2);
        collection.add(element1);

        assertEquals(3, collection.size());
        assertTrue(collection.contains(element1));
        assertTrue(collection.contains(element2));

        collection.removeAll(element1);

        assertEquals(1, collection.size());
        assertFalse(collection.contains(element1));
    }
}
