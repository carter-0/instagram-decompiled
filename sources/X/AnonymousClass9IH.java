package X;

/* renamed from: X.9IH  reason: invalid class name */
public final class AnonymousClass9IH extends AnonymousClass0T0 implements C245723dN {
    public final int A00;
    public final Object A01;

    public AnonymousClass9IH(AnonymousClass3OA r2, int i) {
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
        if (!(obj instanceof AnonymousClass9IH)) {
            return false;
        }
        AnonymousClass9IH r3 = (AnonymousClass9IH) obj;
        if (r3.A00 != i || !0qQ.A0K(this.A01, r3.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
