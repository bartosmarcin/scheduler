
package scheduler; 

/** 
 * 
 * @author Marcin Bartoś
 */ 
public class PriorityQueue <T extends Comparable>{ 
    
    private Object[] heap;
    int size;
    
    public PriorityQueue(int initLength){
        size = 0;
        if( initLength < 1)
            initLength = 1;
        heap = new Object[initLength];
    }
    
    private void enlargeHeap(){
        Object[] temp = heap;
        heap = new Object[temp.length << 1];
        System.arraycopy(temp, 0, heap, 0, temp.length);
    }

} 