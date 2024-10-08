package X;

import java.util.List;

/* renamed from: X.LDd  reason: case insensitive filesystem */
public final class C63922LDd {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63922LDd)) {
            return false;
        }
        C63922LDd lDd = (C63922LDd) obj;
        if (!0qQ.A0K(this.A04, lDd.A04) || !0qQ.A0K(this.A03, lDd.A03) || !0qQ.A0K(this.A02, lDd.A02) || this.A01 != lDd.A01 || this.A00 != lDd.A00) {
            return false;
        }
        return true;
    }

    public C63922LDd(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i >= 0 || i == Integer.MIN_VALUE) {
            list.isEmpty();
            if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw AnonymousClass7TE.A0w("List size + position too large, last item in list beyond totalCount.");
            }
            return;
        }
        throw AnonymousClass7TE.A0w("Position must be non-negative");
    }
}
