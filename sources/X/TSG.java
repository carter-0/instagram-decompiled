package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class TSG extends AbstractSet {
    public final /* synthetic */ TS6 A00;

    public TSG(TS6 ts6) {
        this.A00 = ts6;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return DbV.A16(A02);
        }
        return new C8529QwT(ts6);
    }

    public final boolean remove(Object obj) {
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return A02.keySet().remove(obj);
        }
        if (TS6.A01(ts6, obj) == TS6.A09) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.A00.size();
    }
}
