package core;

import java.util.EmptyStackException;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreatenewempthyStack(){
		Stack s1 = new Stack();
		int size = s1.getsize();
		
		assertEquals(0, s1.getsize());
		assertTrue(s1.isEmpty());
		}
	
    public void testPushObjectElement() {
        Stack s1 = new Stack();
        s1.push(1);
        assertEquals(1, s1.top());
        assertEquals(1, s1.getsize());
        assertFalse(s1.isEmpty());
        assertFalse(s1.isFull());
    }
    
    public void testPopObjectElement() {
        Stack s1 = new Stack();
        s1.push(1);

        assertEquals(1, s1.top());
        assertEquals(1, s1.getsize());
        assertFalse(s1.isEmpty());
        assertFalse(s1.isFull());
    }

    /*public void testPopEmptyStack() {
        Stack s1 = new Stack();

        try {
            s1.pop();
            assertTrue("Expected EmptyStackException", false);
        } catch (EmptyStackException e) {
            // Expected exception
        }
    }*/


    public void testIsFull() {
        Stack s1 = new Stack();
        assertFalse(s1.isFull());

        s1.push(1);
        s1.push(2);
        s1.push(3);

        assertFalse(s1.isFull());
    }
}
