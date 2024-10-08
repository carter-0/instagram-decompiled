package X;

/* renamed from: X.Dtl  reason: case insensitive filesystem */
public final class C47257Dtl extends AnonymousClass0T0 implements C51862G4v {
    public final int A00 = 2131955049;
    public final int A01 = 2131955050;
    public final String A02 = "https://help.instagram.com/477434105621119";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47257Dtl) {
                C47257Dtl dtl = (C47257Dtl) obj;
                if (!(this.A00 == dtl.A00 && this.A01 == dtl.A01 && 0qQ.A0K(this.A02, dtl.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }
}
