package X;

/* renamed from: X.JvQ  reason: case insensitive filesystem */
public final class C61026JvQ extends AnonymousClass0T0 {
    public static final C61026JvQ A03 = new C61026JvQ(false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61026JvQ) {
                C61026JvQ jvQ = (C61026JvQ) obj;
                if (!(this.A02 == jvQ.A02 && this.A01 == jvQ.A01 && this.A00 == jvQ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02)));
    }

    public C61026JvQ(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }

    public C61026JvQ() {
        this(false, false, false);
    }
}
