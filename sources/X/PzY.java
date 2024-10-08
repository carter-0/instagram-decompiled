package X;

import java.util.Iterator;

public final class PzY extends PzX {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PzY(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.A01 = iterable2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Iterator, X.TM5, java.lang.Object] */
    public final Iterator iterator() {
        if (this.A00 == 0) {
            return ((Iterable) this.A01).iterator();
        }
        Qz0 qz0 = new Qz0(this);
        ? obj = new Object();
        obj.A01 = Qz1.A01;
        obj.A02 = qz0;
        return obj;
    }

    public PzY(Iterable[] iterableArr) {
        this.A01 = iterableArr;
    }
}
