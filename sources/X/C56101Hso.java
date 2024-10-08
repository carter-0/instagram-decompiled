package X;

/* renamed from: X.Hso  reason: case insensitive filesystem */
public final class C56101Hso {
    public final C56100Hsn A00;
    public final C56100Hsn A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56101Hso) {
                C56101Hso hso = (C56101Hso) obj;
                if (!0qQ.A0K(this.A01, hso.A01) || !0qQ.A0K(this.A00, hso.A00) || this.A02 != hso.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C56101Hso(C56100Hsn hsn, C56100Hsn hsn2, boolean z) {
        this.A01 = hsn;
        this.A00 = hsn2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Selection(start=");
        A1A.append(this.A01);
        A1A.append(", end=");
        A1A.append(this.A00);
        A1A.append(", handlesCrossed=");
        return G9t.A1C(A1A, this.A02);
    }
}
