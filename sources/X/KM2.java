package X;

public final class KM2 extends AnonymousClass8RS {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KM2) {
                KM2 km2 = (KM2) obj;
                if (!(this.A00 == km2.A00 && this.A01 == km2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getSegmentIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, this.A00 * 31);
    }

    public KM2(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TrimmingSegment(segmentIndex=");
        A1A.append(this.A00);
        A1A.append(", isHandlingTrimmerTouch=");
        return G9t.A1C(A1A, this.A01);
    }
}
