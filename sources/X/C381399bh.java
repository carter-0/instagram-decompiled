package X;

/* renamed from: X.9bh  reason: invalid class name and case insensitive filesystem */
public final class C381399bh extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381399bh) {
                C381399bh r5 = (C381399bh) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TransitionEffectForLogging(name=");
        A1A.append(this.A02);
        A1A.append(", durationMs=");
        A1A.append(this.A00);
        A1A.append(", startTimeMs=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
