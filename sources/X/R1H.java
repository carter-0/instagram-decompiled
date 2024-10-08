package X;

import java.util.Collection;
import java.util.Iterator;

public abstract class R1H<E> extends TSD<E> {
    public abstract Iterator iterator();

    public final AnonymousClass3W6 A00() {
        if (this instanceof R13) {
            return ((R13) this).A00;
        }
        return ((R12) this).A00;
    }

    public final void clear() {
        A00().clear();
    }

    public final boolean contains(Object obj) {
        return A00().contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return A00().containsAll(collection);
    }

    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    public final boolean remove(Object obj) {
        return AnonymousClass7TF.A1R(A00().ECy(obj, Integer.MAX_VALUE));
    }

    public final int size() {
        return A00().entrySet().size();
    }
}
