package X;

import java.util.Iterator;

/* renamed from: X.XDj  reason: case insensitive filesystem */
public final class C21070XDj extends Y1C {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final 1aL A03;
    public final Iterator A04;
    public volatile boolean A05;

    public final int EHR(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.A02 = true;
        return 1;
    }

    public final void clear() {
        this.A01 = true;
    }

    public final void dispose() {
        this.A05 = true;
    }

    public final Object poll() {
        if (!this.A01) {
            if (!this.A00) {
                this.A00 = true;
            } else if (!this.A04.hasNext()) {
                this.A01 = true;
            }
            Object next = this.A04.next();
            1aP.A01(next, "The iterator returned a null value");
            return next;
        }
        return null;
    }

    public C21070XDj(1aL r1, Iterator it) {
        this.A03 = r1;
        this.A04 = it;
    }

    public final boolean isEmpty() {
        return this.A01;
    }
}
