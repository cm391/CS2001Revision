package collections;

public interface ICollection {
    void add(Object obj);
    void remove(Object obj);
    void removeAll(Object obj);
    boolean contains(Object obj);
    int size();
    Object elementAt(int index);
}
