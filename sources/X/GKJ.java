package X;

public final class GKJ extends AnonymousClass0T0 implements JQW {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;

    public GKJ(GEG geg, C267324bN r3, C52058GDe gDe, C59507JMf jMf, C59514JMm jMm, C55268Hex hex, C59527JMz jMz, JN0 jn0, int i, boolean z, boolean z2) {
        this.A00 = i;
        0qQ.A0B(jMf, 4);
        0qQ.A0B(jMz, 8);
        this.A05 = r3;
        this.A07 = gDe;
        this.A06 = geg;
        this.A01 = jMf;
        this.A02 = jMm;
        this.A08 = jn0;
        this.A03 = hex;
        this.A04 = jMz;
        this.A0A = z;
        this.A09 = z2;
    }

    public final C267324bN BML() {
        return (C267324bN) this.A05;
    }

    public final GEG BMM() {
        return (GEG) this.A06;
    }

    public final C52058GDe BMN() {
        return (C52058GDe) this.A07;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof GKJ)) {
            return false;
        }
        GKJ gkj = (GKJ) obj;
        if (gkj.A00 != i || !0qQ.A0K(this.A05, gkj.A05) || !0qQ.A0K(this.A07, gkj.A07) || !0qQ.A0K(this.A06, gkj.A06) || !0qQ.A0K(this.A01, gkj.A01) || !0qQ.A0K(this.A02, gkj.A02) || !0qQ.A0K(this.A08, gkj.A08) || !0qQ.A0K(this.A03, gkj.A03) || !0qQ.A0K(this.A04, gkj.A04) || this.A0A != gkj.A0A || this.A09 != gkj.A09) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TE.A0K(this.A05))))))))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GKJ(GEG geg, C267324bN r14, C52058GDe gDe, C59507JMf jMf, C59514JMm jMm, C55268Hex hex, C59527JMz jMz, JN0 jn0, boolean z) {
        this(geg, r14, gDe, jMf, jMm, hex, jMz, jn0, 0, z, false);
        this.A00 = 0;
    }
}
