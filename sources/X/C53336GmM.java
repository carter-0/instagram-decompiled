package X;

/* renamed from: X.GmM  reason: case insensitive filesystem */
public final class C53336GmM extends AnonymousClass0T0 {
    public final QP7 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53336GmM) {
                C53336GmM gmM = (C53336GmM) obj;
                if (this.A01 != gmM.A01 || !0qQ.A0K(this.A00, gmM.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public C53336GmM(QP7 qp7, boolean z) {
        this.A01 = z;
        this.A00 = qp7;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(isLoading=");
        A1A.append(this.A01);
        A1A.append(", promotionInformationData=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
