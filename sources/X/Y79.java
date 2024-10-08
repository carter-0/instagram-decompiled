package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class Y79 extends C21083XDw implements Iterator, AnonymousClass0s4 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final XE5 A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Y79(X.XE5 r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r3.A00
            X.XDx r0 = r3.A03
            r2.<init>(r1, r0)
            r2.A03 = r3
            int r0 = r0.A00
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y79.<init>(X.XE5):void");
    }

    public final Object next() {
        if (this.A03.A03.A00 == this.A00) {
            Object next = super.next();
            this.A01 = next;
            this.A02 = true;
            return next;
        }
        throw new ConcurrentModificationException();
    }
}
