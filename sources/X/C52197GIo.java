package X;

import java.util.List;

/* renamed from: X.GIo  reason: case insensitive filesystem */
public final class C52197GIo extends AnonymousClass0T0 implements JQW, C59507JMf {
    public final C267324bN A00;
    public final 1Xj A01;
    public final C59508JMg A02;
    public final C59510JMi A03;
    public final C59511JMj A04;
    public final List A05;
    public final boolean A06;
    public final GEG A07;
    public final C52058GDe A08;
    public final AnonymousClass3W1 A09;

    public C52197GIo(GEG geg, C267324bN r3, C52058GDe gDe, 1Xj r5, AnonymousClass3W1 r6, C59508JMg jMg, C59510JMi jMi, C59511JMj jMj, List list, boolean z) {
        0qQ.A0B(jMi, 7);
        0qQ.A0B(jMj, 9);
        this.A00 = r3;
        this.A08 = gDe;
        this.A07 = geg;
        this.A01 = r5;
        this.A09 = r6;
        this.A02 = jMg;
        this.A03 = jMi;
        this.A05 = list;
        this.A04 = jMj;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52197GIo) {
                C52197GIo gIo = (C52197GIo) obj;
                if (!0qQ.A0K(this.A00, gIo.A00) || !0qQ.A0K(this.A08, gIo.A08) || !0qQ.A0K(this.A07, gIo.A07) || !0qQ.A0K(this.A01, gIo.A01) || !0qQ.A0K(this.A09, gIo.A09) || !0qQ.A0K(this.A02, gIo.A02) || !0qQ.A0K(this.A03, gIo.A03) || !0qQ.A0K(this.A05, gIo.A05) || !0qQ.A0K(this.A04, gIo.A04) || this.A06 != gIo.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C267324bN BML() {
        return this.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A08, AnonymousClass7TE.A0K(this.A00))))))))));
    }

    public final GEG BMM() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52058GDe BMN() {
        throw AnonymousClass00P.createAndThrow();
    }
}
