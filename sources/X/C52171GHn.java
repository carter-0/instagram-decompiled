package X;

/* renamed from: X.GHn  reason: case insensitive filesystem */
public final class C52171GHn extends AnonymousClass0T0 implements JN6 {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final boolean A02;
    public final int A03;
    public final C295365o2 A04;

    public C52171GHn(C267324bN r2, C295365o2 r3, C52058GDe gDe, int i, boolean z) {
        0qQ.A0B(r3, 3);
        this.A00 = r2;
        this.A01 = gDe;
        this.A04 = r3;
        this.A03 = i;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52171GHn) {
                C52171GHn gHn = (C52171GHn) obj;
                if (!(0qQ.A0K(this.A00, gHn.A00) && 0qQ.A0K(this.A01, gHn.A01) && this.A04 == gHn.A04 && this.A03 == gHn.A03 && this.A02 == gHn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00));
        return DbS.A06(this.A02, (AnonymousClass7TF.A07(this.A04, A07) + this.A03) * 31);
    }
}
