package X;

/* renamed from: X.GHk  reason: case insensitive filesystem */
public final class C52168GHk extends AnonymousClass0T0 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52168GHk) {
                C52168GHk gHk = (C52168GHk) obj;
                if (!(this.A00 == gHk.A00 && this.A02 == gHk.A02 && this.A01 == gHk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A00)));
    }

    public C52168GHk(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }
}
