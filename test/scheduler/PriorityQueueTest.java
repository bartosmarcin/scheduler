/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcin
 */
public class PriorityQueueTest {
    PriorityQueue q;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        q = new PriorityQueue<Integer>(1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAddStoresGreatestAtTop() {
        System.out.println("add- is highest priority on top?");        
        int[] priorities = {0,4,6,33,56,92,67,492,999,9,5,3};
        for(int priority : priorities)
            q.add(priority);
        assertEquals(999, (int)q.getTop());
    }
    
    @Test
    public void testAddIncrementsSize() {
        System.out.println("add- does increment size?");        
        int[] priorities = {0,4,6,33,56,92,67,492,999,9,5,3};
        for(int priority : priorities)
            q.add(priority);
        assertEquals(12, q.getSize());
    }
    
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void testAddNullArgument() {        
            q.add(null);
    }
    
    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test(expected=java.util.NoSuchElementException.class)
    public void testRemoveFromEmptyQueue() {
        q.remove();
    }

    /**
     * Test of getTop method, of class PriorityQueue.
     */
    @Test
    public void testGetTop() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
