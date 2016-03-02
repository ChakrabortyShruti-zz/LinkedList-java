import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLinkedListShouldAddIntegerToTheList() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        assertEquals(1, list.getLength());
        assertEquals(12, list.getHead().getValue());
        assertEquals(12, list.getTail().getValue());
    }

    @Test
    public void testLinkedListShouldAddStringToTheList() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.add('d');
        assertEquals(1, list.getLength());
        assertEquals('d', list.getHead().getValue());
        assertEquals('d', list.getTail().getValue());
    }

    @Test
    public void testShouldBeAbleToAddMultipleCharElement() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.add('p');
        list.add('i');
        list.add('i');

        assertEquals(3, list.getLength());
        assertEquals('p', list.getHead().getValue());
        assertEquals('i', list.getTail().getValue());
    }

    @Test
    public void testShouldBeAbleToSearchAnElementWhenIndexIsSpecified() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        assertEquals(11, list.searchElementAt(3).getValue());
        assertEquals(10, list.searchElementAt(2).getValue());
        assertEquals(13, list.searchElementAt(4).getValue());
    }

    @Test(expected = NoSuchElementException.class)
    public void testToCheckError() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        list.searchElementAt(9).getValue();
    }

    @Test
    public void testShouldBeAbleToSearchAnStringWhenIndexIsSpecified() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("tom");
        list.add("jerry");

        assertEquals("jerry", list.searchElementAt(2).getValue());
        assertEquals("hello", list.searchElementAt(0).getValue());
    }

    @Test
    public void testToCheckWhetherTheIteratorHasNext() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("tom");
        list.add("jerry");

        Iterator I = list.Iterator();
        assertTrue(I.hasNext());
        assertEquals("tom", I.next().getValue());
        assertTrue(I.hasNext());
        assertEquals("jerry", I.next().getValue());
        assertFalse(I.hasNext());
    }

    @Test
    public void testShouldRemoveTheElement() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("tom");
        list.add("jerry");

        Iterator I = list.Iterator();
        I.remove();
        assertEquals(2, list.getLength());
    }

    @Test
    public void testShouldRemoveTheElementInInteger() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("tom");
        list.add("jerry");

        Iterator I = list.Iterator();
        I.next();
        I.remove();
        I.next();
        I.remove();
        assertEquals(1, list.getLength());
    }
}
