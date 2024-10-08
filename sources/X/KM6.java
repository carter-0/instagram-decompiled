package X;

public final class KM6 extends AnonymousClass8RS implements AnonymousClass8RT {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KM6) {
                KM6 km6 = (KM6) obj;
                if (!(this.A00 == km6.A00 && this.A01 == km6.A01)) {
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
        Integer num = this.A01;
        return (this.A00 * 31) + C51971G9r.A0D(num, C48790EkD.A00(num));
    }

    public KM6(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("JumpCut(segmentIndex=");
        A1A.append(this.A00);
        A1A.append(", detailedState=");
        Integer num = this.A01;
        if (num != null) {
            str = C48790EkD.A00(num);
        } else {
            str = "null";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
