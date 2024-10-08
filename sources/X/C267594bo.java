package X;

import java.util.AbstractSet;
import java.util.ArrayList;

/* renamed from: X.4bo  reason: invalid class name and case insensitive filesystem */
public abstract class C267594bo<E> extends AbstractSet<E> {
    public final Object[] toArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(size());
        C11307SKv.A02(arrayList, iterator());
        return arrayList.toArray(objArr);
    }

    public final Object[] toArray() {
        ArrayList arrayList = new ArrayList(size());
        C11307SKv.A02(arrayList, iterator());
        return arrayList.toArray();
    }
}
