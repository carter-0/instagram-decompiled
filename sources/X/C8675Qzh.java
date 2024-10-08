package X;

import java.util.Iterator;

/* renamed from: X.Qzh  reason: case insensitive filesystem */
public final class C8675Qzh extends PzX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C8675Qzh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Iterator iterator() {
        if (this.A00 != 0) {
            return new R1M(this.A02, ((Iterable) this.A01).iterator(), 0);
        }
        Iterator it = ((Iterable) this.A02).iterator();
        it.getClass();
        return new C8662Qz3((1UV) this.A01, it);
    }
}
