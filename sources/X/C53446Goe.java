package X;

/* renamed from: X.Goe  reason: case insensitive filesystem */
public final class C53446Goe extends AnonymousClass0T0 implements YBJ {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53446Goe) {
                C53446Goe goe = (C53446Goe) obj;
                if (!(this.A00 == goe.A00 && this.A01 == goe.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51965G9l.A05(this.A00));
    }

    public C53446Goe(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
