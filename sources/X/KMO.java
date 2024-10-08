package X;

public final class KMO extends C62762Km0 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMO) {
                KMO kmo = (KMO) obj;
                if (this.A00 != kmo.A00 || !0qQ.A0K(this.A03, kmo.A03) || !0qQ.A0K(this.A01, kmo.A01) || this.A02 != kmo.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public KMO(Integer num, Integer num2, int i, boolean z) {
        this.A00 = i;
        this.A03 = num;
        this.A01 = num2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Delete(index=");
        A1A.append(this.A00);
        A1A.append(", deletedSegmentStartTimeMs=");
        A1A.append(this.A03);
        A1A.append(", deletedSegmentDurationMs=");
        A1A.append(this.A01);
        A1A.append(", isStarted=");
        return G9t.A1C(A1A, this.A02);
    }
}
