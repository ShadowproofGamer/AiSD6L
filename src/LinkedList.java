import java.util.AbstractList;
import java.util.Iterator;

public class LinkedList<E> extends AbstractList<E> {
    Element head = null;
    //Element tail = null;
    public LinkedList() {
    }

    @Override
    public int size() {
        int pos = 0;
        Element actElem = head;
        while (actElem != null) {
            pos++;
            actElem = actElem.getNext();
        }
        return pos;
    }

    @Override
    public E get(int index) {
        return getElement(index).getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = null;
        //tail = null;
    }

    private Element getElement(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        Element actElem = head;
        while (index > 0 && actElem != null) {
            index--;
            actElem = actElem.getNext();
        }
        if (actElem == null)
            throw new IndexOutOfBoundsException();
        return actElem;
    }

    @Override
    public boolean add(E e) {
        Element newElem = new Element(e);
        if (head == null) {
            head = newElem;
            //tail = head;
            return true;
        }
        Element tail = head;
        while (tail.getNext() != null)
            tail = tail.getNext();
        tail.setNext(newElem);
        return true;
    }

    private class Element {
        private E value;
        private Element next;

        Element(E data) {
            this.value = data;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }
    public Iterator<E> iterator(){

        return null;
    }
    private class LinkedListIterator implements Iterator<E>{
        Element _current = head;

        public boolean hasNext() {
            return _current.getNext() != head;
        }

        public E next() {
            _current = _current.getNext();
            return _current.getValue();
        }
    }

}
