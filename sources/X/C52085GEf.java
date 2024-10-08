package X;

/* renamed from: X.GEf  reason: case insensitive filesystem */
public final class C52085GEf extends AnonymousClass0T0 implements JN5 {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final 1Xj A02;
    public final int A03;
    public final C295365o2 A04;

    public C52085GEf(C267324bN r2, C295365o2 r3, C52058GDe gDe, 1Xj r5, int i) {
        0qQ.A0B(r3, 4);
        this.A00 = r2;
        this.A01 = gDe;
        this.A02 = r5;
        this.A04 = r3;
        this.A03 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52085GEf) {
                C52085GEf gEf = (C52085GEf) obj;
                if (!0qQ.A0K(this.A00, gEf.A00) || !0qQ.A0K(this.A01, gEf.A01) || !0qQ.A0K(this.A02, gEf.A02) || this.A04 != gEf.A04 || this.A03 != gEf.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)))) + this.A03;
    }
}
