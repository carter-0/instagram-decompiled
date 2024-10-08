package X;

/* renamed from: X.Gas  reason: case insensitive filesystem */
public final class C52680Gas extends AnonymousClass0T0 implements JQW, C59507JMf {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final C59509JMh A02;
    public final C59510JMi A03;
    public final C59511JMj A04;
    public final C59513JMl A05;
    public final boolean A06;
    public final GEG A07;
    public final C267324bN A08;
    public final C52058GDe A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52680Gas) {
                C52680Gas gas = (C52680Gas) obj;
                if (!0qQ.A0K(this.A08, gas.A08) || !0qQ.A0K(this.A09, gas.A09) || !0qQ.A0K(this.A07, gas.A07) || !0qQ.A0K(this.A00, gas.A00) || !0qQ.A0K(this.A01, gas.A01) || !0qQ.A0K(this.A03, gas.A03) || this.A06 != gas.A06 || !0qQ.A0K(this.A04, gas.A04) || !0qQ.A0K(this.A05, gas.A05) || !0qQ.A0K(this.A02, gas.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C52680Gas(GEG geg, C267324bN r3, C52058GDe gDe, 1Xj r5, AnonymousClass3W1 r6, C59509JMh jMh, C59510JMi jMi, C59511JMj jMj, C59513JMl jMl, boolean z) {
        DbW.A1P(jMi, 10, jMj);
        0qQ.A0B(jMh, 14);
        this.A08 = r3;
        this.A09 = gDe;
        this.A07 = geg;
        this.A00 = r5;
        this.A01 = r6;
        this.A03 = jMi;
        this.A06 = z;
        this.A04 = jMj;
        this.A05 = jMl;
        this.A02 = jMh;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A09, AnonymousClass7TE.A0K(this.A08)))));
        int A002 = C54732HQn.A00();
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A03, (((((((A072 + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31)))));
    }

    public final C267324bN BML() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final GEG BMM() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52058GDe BMN() {
        throw AnonymousClass00P.createAndThrow();
    }
}
