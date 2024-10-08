package X;

import java.util.Iterator;

/* renamed from: X.Qzi  reason: case insensitive filesystem */
public final class C8676Qzi extends PzX {
    public final Iterable A00;

    public final Iterator iterator() {
        Iterator it = this.A00.iterator();
        it.getClass();
        if (it instanceof C249803kO) {
            return it;
        }
        return new R1Q(it);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C8676Qzi(Iterable iterable) {
        this.A00 = iterable;
    }
}
