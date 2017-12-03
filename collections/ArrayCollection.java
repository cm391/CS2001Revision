package collections;

public class ArrayCollection implements ICollection {
    private Object[] store;
    private int currentSize;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayCollection() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayCollection(int capacity) {
        store = new Object[capacity];
        currentSize = 0;
    }
    @Override
    public void add(Object obj) {
        if (currentSize < store.length) {
            store[currentSize] = obj;
            currentSize++;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    //First instance of object removed
    //Order of the list is not preserved
    //Removed element is just replaced by last element in the array.
    public void remove(Object obj) {
        for (int i = 0; i < currentSize; i++) {
            if(store[i].equals(obj)) {
                store[i] = store[--currentSize];
                return ;
            }
        }
    }

    @Override
    public void removeAll(Object obj) {
        for (int i = 0; i < currentSize; i++) {
            if(store[i].equals(obj)) {
                store[i--] = store[--currentSize];
            }
        }
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < currentSize; i++) {
            if (store[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public Object elementAt(int index) {
        if (index > -1 && index < currentSize) {
            return store[index];
        } else {
            throw new IllegalArgumentException();
        }
    }
}
