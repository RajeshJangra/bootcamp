package bootcamp;

import java.util.Set;

public class MyHashSet<E> {
    Set<E> set;

    public MyHashSet(Set<E> set) {
        this.set = set;
    }

    public boolean add(E abc) {
        return set.add(encrypt(abc));
    }

    private E encrypt(E abc){
        return abc;
    }
}
