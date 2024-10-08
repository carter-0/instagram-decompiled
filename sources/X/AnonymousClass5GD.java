package X;

import java.util.Iterator;

/* renamed from: X.5GD  reason: invalid class name */
public abstract class AnonymousClass5GD implements Iterator {
    public final Iterator A00;

    public Object A00(Object obj) {
        return ((AnonymousClass5GB) this).A00.function.apply(obj);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final Object next() {
        return A00(this.A00.next());
    }

    public final void remove() {
        this.A00.remove();
    }

    public AnonymousClass5GD(Iterator it) {
        it.getClass();
        this.A00 = it;
    }
}
