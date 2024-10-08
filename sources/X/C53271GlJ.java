package X;

/* renamed from: X.GlJ  reason: case insensitive filesystem */
public final class C53271GlJ extends AnonymousClass0T0 {
    public final long A00;
    public final Boolean A01;
    public final Long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53271GlJ) {
                C53271GlJ glJ = (C53271GlJ) obj;
                if (!0qQ.A0K(this.A01, glJ.A01) || !0qQ.A0K(this.A02, glJ.A02) || this.A00 != glJ.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + C51968G9o.A03(this.A00);
    }

    public C53271GlJ(Boolean bool, Long l, long j) {
        this.A01 = bool;
        this.A02 = l;
        this.A00 = j;
    }
}
