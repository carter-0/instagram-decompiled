package X;

/* renamed from: X.Hsc  reason: case insensitive filesystem */
public final class C56089Hsc {
    public final int A00;
    public final HMN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56089Hsc) {
                C56089Hsc hsc = (C56089Hsc) obj;
                if (!(this.A00 == hsc.A00 && this.A01 == hsc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public C56089Hsc(HMN hmn, int i) {
        this.A00 = i;
        this.A01 = hmn;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeedbackBadOption(titleResId=");
        A1A.append(this.A00);
        A1A.append(", feedbackSource=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
