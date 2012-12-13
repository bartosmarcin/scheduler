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
    public void testAdd() {
        System.out.println("add");        
        q.add(0);
        assertSame(q.getTop(), 0);
        q.add(1);
        assertSame(q.getTop(), 1);
        q.add(-1);
        assertSame(q.getTop(), 1);
    }
    
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void testAddNullArgument() {        
            q.add(null);
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
