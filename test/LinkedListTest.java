import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void testLinkedListShouldAddElementToTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        assertEquals(1,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(12,list.getTail().getValue());
    }

    @Test
    public void testLinkedListShouldAddTwoElementToTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        assertEquals(2,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(18,list.getTail().getValue());
    }

    @Test
    public void testLinkedListShouldAddMultiElementToTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        assertEquals(5,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(13,list.getTail().getValue());
    }

    @Test
    public void testLinkedListShouldAddMultiElementToTheListAndShouldShowThePreviousElement() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        assertEquals(5,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(13,list.getTail().getValue());
        assertEquals(11,list.getTail().getPrevElement().getValue());
    }

    @Test
    public void testLinkedListShouldAddMultiElementToTheListAndShouldShowTheNextElement() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        assertEquals(5,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(13,list.getTail().getValue());
        assertEquals(18,list.getHead().getNextElement().getValue());
    }
}
