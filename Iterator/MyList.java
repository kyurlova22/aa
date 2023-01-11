import java.util.LinkedList;

// Implement my list as an extension of LinkedList<T> from Java
public class MyList<T> extends LinkedList<T> implements Aggregate<T> {

    @Override
    public Iterator createIterator() {
        return new MyListIterator<>(this);
    }
}
