package X;

/* renamed from: X.Gqj  reason: case insensitive filesystem */
public final class C53568Gqj extends AnonymousClass0T0 implements C59505JMd {
    public final GZ2 A00;
    public final C267324bN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53568Gqj) {
                C53568Gqj gqj = (C53568Gqj) obj;
                if (!0qQ.A0K(this.A01, gqj.A01) || !0qQ.A0K(this.A00, gqj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C53568Gqj(GZ2 gz2, C267324bN r2) {
        this.A01 = r2;
        this.A00 = gz2;
    }
}
