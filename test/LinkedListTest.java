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

    @Test
    public void testLinkedListShouldBeAbleToSearchAnElementWhenIndexIsSpecified() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(11);
        list.add(13);

        assertEquals(11,list.searchElementAt(3));
        assertEquals(10,list.searchElementAt(2));
        assertEquals(0,list.searchElementAt(9));
        assertEquals(13,list.searchElementAt(4));
    }

    @Test
    public void testShouldRemoveTheGivenElementFromTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);

        list.remove(18);
        assertEquals(2,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(10,list.getTail().getValue());
    }

    @Test
    public void testShouldRemoveTheFirstElementFromTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);

        list.remove(10);
        assertEquals(2,list.getLength());
        assertEquals(12,list.getHead().getValue());
        assertEquals(18,list.getTail().getValue());
    }

    @Test
    public void testShouldRemoveTheLastElementFromTheList() throws Exception {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(18);
        list.add(10);

        list.remove(12);
        assertEquals(2,list.getLength());
        assertEquals(18,list.getHead().getValue());
        assertEquals(10,list.getTail().getValue());
    }
}
