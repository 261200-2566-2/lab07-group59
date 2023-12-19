import java.util.Collection;
import java.util.Iterator;

public interface Set<S> {
    boolean add(S obj); //add object to set
    boolean addAll(Collection<? extends S> OtherSet); //add all object from OtherSet to S
    void clear();
    boolean contains(Object obj); //check if S have obj
    boolean containsAll(Collection<?> OtherSet); //check if S have everything from OtherSet
    static <S> Set<S> copyOf(Collection<? extends S> OtherSet) {
        return null;
    }
    int hashCode();
    boolean isEmpty(); //check if S is empty set
    Iterator<S> iterator(); //To contain every object into S
    boolean remove(Object obj); //remove obj from S
    boolean removeAll(Collection<?> OtherSet); //Remove everything in S that OtherSet have
    boolean retainAll(Collection<?> OtherSet); //Retain everything OtherSet and S have in common
    int size();
}