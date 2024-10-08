package X;

public final class GLQ extends AnonymousClass0T0 implements C59511JMj {
    public final int A00;
    public final C52087GEh A01;
    public final C52088GEi A02;
    public final C267324bN A03;
    public final C52058GDe A04;
    public final boolean A05;
    public final int A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GLQ) {
                GLQ glq = (GLQ) obj;
                if (!0qQ.A0K(this.A03, glq.A03) || !0qQ.A0K(this.A04, glq.A04) || this.A00 != glq.A00 || this.A05 != glq.A05 || this.A06 != glq.A06 || !0qQ.A0K(this.A01, glq.A01) || !0qQ.A0K(this.A02, glq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A03);
        boolean z = this.A05;
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A04, A0K) + this.A00) * 31) + this.A06) * 31));
    }

    public GLQ(C52087GEh gEh, C52088GEi gEi, C267324bN r3, C52058GDe gDe, int i, int i2, boolean z) {
        this.A03 = r3;
        this.A04 = gDe;
        this.A00 = i;
        this.A05 = z;
        this.A06 = i2;
        this.A01 = gEh;
        this.A02 = gEi;
    }
}
