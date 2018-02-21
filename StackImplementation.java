import java.util.LinkedList;
import java.util.List;

public class StackImplementation<E> implements Stack<E>{

    List<E> pila =new LinkedList<E>();
    int size;

    public StackImplementation(int l){
        this.size = l;
    }

    public E pop() throws PilaBuidaException{
        if(pila.size()==0) throw new PilaBuidaException();
        return pila.get(pila.size());
    }

    public void push(E e) throws PilaPlenaException{
        if(pila.size()==size) throw new PilaPlenaException();
        pila.add(e);
    }

    public int size(){
        return pila.size();
    }
}
