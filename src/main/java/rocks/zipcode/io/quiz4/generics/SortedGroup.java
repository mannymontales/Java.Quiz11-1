package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    List<Object> listy = new ArrayList<>();
    @Override
    public void insert(Object value) {
        listy.add(value);
    }

    @Override
    public void delete(Object value) {
        listy.remove(value);
    }

    public Integer indexOf(_ value) {
        return (Integer) listy.get((Integer) value);
    }
}
