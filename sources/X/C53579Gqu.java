package X;

/* renamed from: X.Gqu  reason: case insensitive filesystem */
public final class C53579Gqu extends AnonymousClass0T0 implements C59510JMi {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53579Gqu) {
                C53579Gqu gqu = (C53579Gqu) obj;
                if (!0qQ.A0K(this.A00, gqu.A00) || !0qQ.A0K(this.A01, gqu.A01) || this.A03 != gqu.A03 || this.A02 != gqu.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00))));
    }

    public C53579Gqu(C267324bN r1, C52058GDe gDe, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = gDe;
        this.A03 = z;
        this.A02 = z2;
    }
}
