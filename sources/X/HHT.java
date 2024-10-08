package X;

public final class HHT extends C54720HPz {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHT) {
                HHT hht = (HHT) obj;
                if (!(this.A01 == hht.A01 && this.A00 == hht.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A02 = C51967G9n.A02(this.A01);
        long j = this.A00;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    public HHT(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BaselineCap(capSpacing=");
        A1A.append(2Wd.A04(this.A01));
        A1A.append(", baselineSpacing=");
        return AnonymousClass7TG.A0n(2Wd.A04(this.A00), A1A);
    }
}
