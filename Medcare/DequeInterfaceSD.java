package Medcare;

public interface DequeInterfaceSD<T>
{
  //void enqueueFront(T element);
  // Adds element to the front of this queue.

  //void enqueueRear(T element);
  // Adds element to the rear of this queue.

  //T dequeueFront() throws QueueUnderflowExceptionSD;
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.

  //T dequeueRear() throws QueueUnderflowExceptionSD;
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes rear element from this queue and returns it.

  boolean isFull();
  // Returns true if this queue is full; otherwise, returns false.

  boolean isEmpty();
  // Returns true if this queue is empty; otherwise, returns false.
  
  int size();
  // Returns the number of elements in this queue.
}




