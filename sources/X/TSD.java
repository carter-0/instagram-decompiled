package X;

import java.util.AbstractSet;
import java.util.Collection;

public abstract class TSD<E> extends AbstractSet<E> {
    public boolean removeAll(Collection collection) {
        return C281945Ae.A05(collection, this);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
