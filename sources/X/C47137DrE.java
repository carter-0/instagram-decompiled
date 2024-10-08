package X;

/* renamed from: X.DrE  reason: case insensitive filesystem */
public final class C47137DrE extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;

    public C47137DrE(String str, int i) {
        this.A00 = i;
        this.A01 = str;
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
        if (!(obj instanceof C47137DrE)) {
            return false;
        }
        C47137DrE drE = (C47137DrE) obj;
        if (drE.A00 != i || !0qQ.A0K(this.A01, drE.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
