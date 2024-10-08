package X;

/* renamed from: X.DrM  reason: case insensitive filesystem */
public final class C47145DrM extends AnonymousClass0T0 {
    public final C47161Drc A00;
    public final boolean A01;

    public C47145DrM(C47161Drc drc, boolean z) {
        0qQ.A0B(drc, 1);
        this.A00 = drc;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47145DrM) {
                C47145DrM drM = (C47145DrM) obj;
                if (!0qQ.A0K(this.A00, drM.A00) || this.A01 != drM.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
