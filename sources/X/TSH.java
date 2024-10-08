package X;

import java.util.AbstractSet;
import java.util.ArrayList;

public abstract class TSH<T> extends AbstractSet<T> {
    public final /* synthetic */ C367698rQ A00;

    public TSH(C367698rQ r1) {
        this.A00 = r1;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
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
