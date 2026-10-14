class RecentCounter {
    int a[];
    int front;
    int rear;

    public RecentCounter() {
        a = new int[10000];
        front = 0;
        rear = -1;
    }

    public int ping(int t) {
        rear++;
        a[rear] = t;

        while (a[front] < t - 3000) {
            front++;
        }

        return rear - front + 1;
    }
}