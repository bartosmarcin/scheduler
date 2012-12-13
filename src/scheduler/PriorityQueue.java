
package scheduler; 

/** 
 * 
 * @author Marcin Bartoś
 */ 
public class PriorityQueue <T extends Comparable>{ 
    
    private Comparable[] heap;
    private int size;
    
    public PriorityQueue(int initLength){
        size = 0;
        if( initLength < 1)
            initLength = 1;
        heap = new Comparable[initLength];
    }
    
    public void add(T newNode){
        if(newNode == null)
            throw new IllegalArgumentException("Cannot add null");
        if(size >= heap.length)
            enlargeHeap();
        if(size == 0)
            heap[0] = newNode;
        else
            pushUp(size, newNode);
        size++;
    }
    
    public void pushUp(int index, T node){
        int parentIndex;
        while( index > 0)
        {
            parentIndex = getParentIndex(index);
            if( node.compareTo( heap[parentIndex] ) >= 0 )
                break;
            heap[index] = heap[parentIndex];
            index = parentIndex;
        }
        heap[index] = node;
    }
    
    private int getParentIndex(int index){ //TODO reconsider need of this
        return (index-1) >> 1;
    }
    
    private void enlargeHeap(){
        Object[] temp = heap;
        heap = new Comparable[temp.length << 1];
        System.arraycopy(temp, 0, heap, 0, temp.length);
    }
    
    public Comparable getTop(){
        return heap[0];
    }
} 