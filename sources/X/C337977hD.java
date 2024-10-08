package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7hD  reason: invalid class name and case insensitive filesystem */
public final class C337977hD implements Iterator {
    public int A00;
    public int A01;
    public final List A02;
    public final boolean A03;

    /* renamed from: A00 */
    public final synchronized C295015nP next() {
        C295015nP r3;
        if (!hasNext()) {
            r3 = null;
        } else {
            r3 = (C295015nP) this.A02.get(this.A00);
            boolean z = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            if (z) {
                i2 = i - 1;
            }
            this.A00 = i2;
            this.A01--;
        }
        return r3;
    }

    public final void remove() {
    }

    public final boolean hasNext() {
        int i;
        while (this.A01 > 0 && (i = this.A00) >= 0) {
            List list = this.A02;
            if (i >= list.size()) {
                return false;
            }
            C295015nP r1 = (C295015nP) list.get(this.A00);
            if (r1.A02().EFF() && !r1.A09()) {
                return true;
            }
            boolean z = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            this.A00 = i3;
        }
        return false;
    }

    public C337977hD(List list, int i, int i2, boolean z) {
        this.A02 = new ArrayList(list);
        this.A00 = z ? i - 1 : i + 1;
        this.A01 = i2;
        this.A03 = z;
    }
}
