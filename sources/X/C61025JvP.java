package X;

/* renamed from: X.JvP  reason: case insensitive filesystem */
public final class C61025JvP extends AnonymousClass0T0 {
    public static final C61025JvP A03 = new C61025JvP(false, true, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61025JvP) {
                C61025JvP jvP = (C61025JvP) obj;
                if (!(this.A01 == jvP.A01 && this.A00 == jvP.A00 && this.A02 == jvP.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A00, C51965G9l.A05(this.A01)));
    }

    public C61025JvP(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }

    public C61025JvP() {
        this(false, true, false);
    }
}
