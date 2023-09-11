package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_ extends Object> implements GroupInterface{

    List<Object> listy = new ArrayList<>();
    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

//    public Integer count() {
//        return listy.size();
//    }



//    public void insert(_ value) {
//    }

//    public Boolean has(_ value) {
//        return null;
//    }

    @Override
    public Integer count() {
        return listy.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return listy.contains(valueToInsert);
    }

    public Object fetch(int indexOfValue) {
        return listy.get(indexOfValue);
    }

    @Override
    public void insert(Object value) {
        listy.add(value);
    }

    @Override
    public void delete(Object valueToInsert) {
        listy.remove(valueToInsert);
    }

    @Override
    public void clear() {
        listy.clear();
    }

//    public void delete(_ value) {
//    }

//    public void clear() {
//        listy.clear();
//    }

    public Iterator<_> iterator() {
        return (Iterator<_>) listy.iterator();
    }

    @Override
    public String toString() {
        return listy.toString();
    }
}
