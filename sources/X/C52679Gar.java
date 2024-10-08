package X;

/* renamed from: X.Gar  reason: case insensitive filesystem */
public final class C52679Gar extends AnonymousClass0T0 implements C59513JMl {
    public final boolean A00;
    public final C267324bN A01;
    public final C52058GDe A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52679Gar) {
                C52679Gar gar = (C52679Gar) obj;
                if (!0qQ.A0K(this.A01, gar.A01) || !0qQ.A0K(this.A02, gar.A02) || this.A00 != gar.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public C52679Gar(C267324bN r1, C52058GDe gDe, boolean z) {
        this.A01 = r1;
        this.A02 = gDe;
        this.A00 = z;
    }
}
