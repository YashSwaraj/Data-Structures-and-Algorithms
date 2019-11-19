class MyQueue 
{ 
    int front, rear, size; 
    int  capacity; 
    int array[]; 
       
    public MyQueue(int n) { 
         capacity = n; 
         front = rear = size = 0;
         array = new int[capacity]; 
            
    } 
       
    boolean isFull(MyQueue queue) 
    {  
		return (queue.size == queue.capacity); 
    } 
       
    boolean isEmpty(MyQueue queue) 
    {
		return (queue.size == 0); 
	} 
       
    void enqueue(int item) 
    { 
        if (isFull(this)) 
            return; 
        rear = rear + 1;
        array[rear] = item;
        size = size + 1;
    } 
       
    int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        int item = array[front]; 
        front = (front + 1)%capacity; 
        size = size - 1; 
        return item; 
    } 
       
    int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return array[front]; 
    } 
        
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[rear]; 
    } 
	int compareq(MyQueue q)
	{
		if(this.dequeue() == q.dequeue())
			return (1);
		if(this.dequeue() > q.dequeue())
			return (0);
		if(this.dequeue() < q.dequeue())
			return (2);
		return Integer.MIN_VALUE; 
	}
} 
   
class Test 
{ 
    public static void main(String[] args)  
    { 
        MyQueue queue1 = new MyQueue(100); 
            
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
		
		MyQueue queue2 = new MyQueue(100); 
            
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        queue2.enqueue(40);
        for(int i=0; i<=4; i++)
		{
			int check = queue1.compareq(queue2);
			if (check==1)
					System.out.println("The popped elements are equal");
			else if (check==0)
					System.out.println("The element of first queue is bigger");
			else if (check==2)
					System.out.println("The element of first queue is bigger");
		}	
    } 
} 
