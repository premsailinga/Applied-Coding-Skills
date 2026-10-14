class MyCircularQueue {
    int a[];
    int front;
    int rear;
    int count;
    int size;

    public MyCircularQueue(int k) {
        a = new int[k];
        front = 0;
        rear = -1;
        count = 0;
        size = k;
    }

    public boolean enQueue(int value) {
        if (count == size) {
            return false;
        }

        rear = (rear + 1) % size;
        a[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (count == 0) {
            return false;
        }

        front = (front + 1) % size;
        count--;
        return true;
    }

    public int Front() {
        if (count == 0) {
            return -1;
        }

        return a[front];
    }

    public int Rear() {
        if (count == 0) {
            return -1;
        }

        return a[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}