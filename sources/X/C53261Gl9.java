package X;

/* renamed from: X.Gl9  reason: case insensitive filesystem */
public final class C53261Gl9 extends AnonymousClass0T0 {
    public final long A00 = 1;
    public final boolean A01 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53261Gl9) {
                C53261Gl9 gl9 = (C53261Gl9) obj;
                if (!(this.A01 == gl9.A01 && this.A00 == gl9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return ((C51965G9l.A05(this.A01) + ((int) (0 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
