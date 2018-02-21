public interface Stack<E> {

    public E pop() throws PilaBuidaException;
    public void push(E e) throws PilaPlenaException;
    public int size();
}
