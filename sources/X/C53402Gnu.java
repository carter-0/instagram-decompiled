package X;

/* renamed from: X.Gnu  reason: case insensitive filesystem */
public final class C53402Gnu extends AnonymousClass0T0 implements C59535JNh {
    public final C361838gt A00;
    public final boolean A01;

    public C53402Gnu(C361838gt r2, boolean z) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53402Gnu) {
                C53402Gnu gnu = (C53402Gnu) obj;
                if (!(this.A00 == gnu.A00 && this.A01 == gnu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CRB() {
        return this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
