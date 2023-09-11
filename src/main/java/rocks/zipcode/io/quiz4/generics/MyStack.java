package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    Stack<SomeType> stacker = new Stack<>();
    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        //this(stacker);
    }

    public Boolean isEmpty() {
        return stacker.isEmpty();
    }

    public void push(SomeType i) {
        //if ()
        stacker.push(i);
    }

    public SomeType peek() throws EmptyStackException {
        //throw new UnsupportedOperationException("Method not yet implemented");

        if (!stacker.isEmpty()) {
            return stacker.peek();
        }
        return null ;
    }

    public SomeType pop() {
        return stacker.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
