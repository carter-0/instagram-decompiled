package X;

/* renamed from: X.Drn  reason: case insensitive filesystem */
public final class C47172Drn extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;

    public C47172Drn(G5E g5e) {
        0qQ.A0B(g5e, 1);
        this.A01 = g5e;
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
        if (!(obj instanceof C47172Drn)) {
            return false;
        }
        C47172Drn drn = (C47172Drn) obj;
        if (drn.A00 != i || !0qQ.A0K(this.A01, drn.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C47172Drn(C61059Jvx jvx) {
        0qQ.A0B(jvx, 1);
        this.A01 = jvx;
    }
}
