package X;

/* renamed from: X.GlI  reason: case insensitive filesystem */
public final class C53270GlI extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final YCQ A02;

    public C53270GlI(YCQ ycq, long j, long j2) {
        0qQ.A0B(ycq, 3);
        this.A01 = j;
        this.A00 = j2;
        this.A02 = ycq;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53270GlI) {
                C53270GlI glI = (C53270GlI) obj;
                if (!(this.A01 == glI.A01 && this.A00 == glI.A00 && 0qQ.A0K(this.A02, glI.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A01(this.A00, C51967G9n.A02(this.A01)));
    }
}
