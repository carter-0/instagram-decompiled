package X;

/* renamed from: X.Gqy  reason: case insensitive filesystem */
public final class C53583Gqy extends AnonymousClass0T0 implements JN1 {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53583Gqy) {
                C53583Gqy gqy = (C53583Gqy) obj;
                if (!0qQ.A0K(this.A01, gqy.A01) || !0qQ.A0K(this.A00, gqy.A00)) {
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

    public C53583Gqy(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
