package X;

/* renamed from: X.9cm  reason: invalid class name and case insensitive filesystem */
public final class C381909cm extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final int A00;
    public final Object A01;

    public C381909cm(1Xj r2, int i) {
        this.A00 = i;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C381909cm)) {
            return false;
        }
        C381909cm r3 = (C381909cm) obj;
        if (r3.A00 != i || !0qQ.A0K(this.A01, r3.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
