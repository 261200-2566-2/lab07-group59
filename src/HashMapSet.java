//code Inspire from group 2(Including Set page)
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapSet<S> implements Set<S>{
    private final HashMap<S,Boolean> map;

    public HashMapSet(){
        map = new HashMap<S,Boolean>();//create new map
    }
    @SuppressWarnings("unchecked")//learned from StackOverflow.com to suppress warning which not effecting the method
    public boolean add(Object obj) {
        if(!map.containsKey(obj)){//check if map already have obj or not
            map.put((S) obj,true);
            return true;
        }else return false;
    }
    @SuppressWarnings("rawtypes")//learned from StackOverflow.com to suppress warning which not effecting the method
    public boolean addAll(Collection OtherSet){return false;}//add every obj in OtherSet into map
    public void clear(){
        map.clear();
    }
    public boolean contains(Object obj){//check if map have obj
       return map.containsKey(obj);
    }
    public boolean containsAll(Collection<?> OtherSet){//check if map have everything in OtherSet
        return false;
    }
    public boolean isEmpty(){//check if map is empty or not
        return map.isEmpty();
    }
    public Iterator<S> iterator(){
        return null;
    }
    public boolean remove(Object obj){return map.remove(obj);}
    @SuppressWarnings("rawtypes")
    public boolean removeAll(Collection OtherSet){//Remove everything OtherSet have in map
        return false;
    }
    @SuppressWarnings("rawtypes")
    public boolean retainAll(Collection OtherSet){//Retain everything OtherSet have in map
        return false;
    }
    public int size() {return map.size();}
}