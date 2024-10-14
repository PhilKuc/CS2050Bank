class CustomerQueue {
    private Node front, rear;
    private int queueSize; // queue size

    //linked list node
    private class Node {
        Customer data;
        Node next;
    }
    //default constructor - initially front & rear are null; size=0; queue is empty
    public CustomerQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }
    //check if the queue is empty
    public boolean isEmpty() {
        return (queueSize == 0);
    }
    //Remove item from the front of the queue.
    public Customer dequeue() {
        Customer data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        queueSize--;
        return data;
    }
    //Add data at the rear of the queue.
    public void enqueue(Customer data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        queueSize++;
    }
    //print front and rear of the queue
    public void print_frontRear() {
        System.out.println("Front of the queue:" + front.data +
                " Rear of the queue:" + rear.data);
    }
}
