package X;

public final class N9O extends AnonymousClass0T0 implements C74269Prx {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9O) {
                N9O n9o = (N9O) obj;
                if (!(this.A01 == n9o.A01 && this.A00 == n9o.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, C51965G9l.A05(this.A01));
    }

    public N9O(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcLoungeModel(show=");
        A1A.append(this.A01);
        A1A.append(", isAudioOn=");
        return G9t.A1C(A1A, this.A00);
    }

    public N9O() {
        this(false, false);
    }
}
