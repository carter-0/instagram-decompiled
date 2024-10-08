package X;

/* renamed from: X.Gqt  reason: case insensitive filesystem */
public final class C53578Gqt extends AnonymousClass0T0 implements C59510JMi {
    public final C267324bN A00;
    public final C52058GDe A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53578Gqt) {
                C53578Gqt gqt = (C53578Gqt) obj;
                if (!0qQ.A0K(this.A00, gqt.A00) || !0qQ.A0K(this.A01, gqt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C53578Gqt(C267324bN r1, C52058GDe gDe) {
        this.A00 = r1;
        this.A01 = gDe;
    }
}
