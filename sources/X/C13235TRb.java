package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TRb  reason: case insensitive filesystem */
public final class C13235TRb extends AbstractCollection<V> {
    public final /* synthetic */ C367698rQ A00;

    public C13235TRb(C367698rQ r1) {
        this.A00 = r1;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new C41291ArX(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public final Object[] toArray(Object[] objArr) {
        ArrayList A14 = Pxg.A14(this);
        C11307SKv.A02(A14, iterator());
        return A14.toArray(objArr);
    }

    public final Object[] toArray() {
        ArrayList A14 = Pxg.A14(this);
        C11307SKv.A02(A14, iterator());
        return A14.toArray();
    }
}
