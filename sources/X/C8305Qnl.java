package X;

/* renamed from: X.Qnl  reason: case insensitive filesystem */
public final class C8305Qnl extends C9684Rf2 {
    public final C9682Rf0 A00;
    public final C8861RDc A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9684Rf2)) {
                return false;
            }
            C8861RDc rDc = this.A01;
            C8305Qnl qnl = (C8305Qnl) ((C9684Rf2) obj);
            C8861RDc rDc2 = qnl.A01;
            if (rDc == null) {
                if (rDc2 != null) {
                    return false;
                }
            } else if (!rDc.equals(rDc2)) {
                return false;
            }
            C9682Rf0 rf0 = this.A00;
            C9682Rf0 rf02 = qnl.A00;
            return rf0 == null ? rf02 == null : rf0.equals(rf02);
        }
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0C(this.A01) ^ 1000003) * 1000003) ^ AnonymousClass7TE.A0L(this.A00);
    }

    public C8305Qnl(C9682Rf0 rf0, C8861RDc rDc) {
        this.A01 = rDc;
        this.A00 = rf0;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClientInfo{clientType=");
        A1A.append(this.A01);
        A1A.append(", androidClientInfo=");
        return C66582MXn.A0v(this.A00, A1A);
    }
}
