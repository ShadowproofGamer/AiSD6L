public class LinkedListQueue<T> implements IQueue<T> {
    LinkedList<T> array = new LinkedList<>();
    int beginIndex;
    int endIndex;

    @Override
    public boolean isEmpty() {
        return beginIndex == endIndex;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();
        return array.get(beginIndex++);
    }

    @Override
    public void enqueue(T elem) throws FullQueueException {
        if (isFull())
            throw new FullQueueException();
        array.add(elem);
        endIndex++;
    }

    @Override
    public int size() {
        return endIndex - beginIndex;
    }

    @Override
    public T first() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();
        return array.get(beginIndex);
    }
}