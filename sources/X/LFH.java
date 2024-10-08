package X;

public final class LFH {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        LFH lfh;
        if (this != obj) {
            if (obj instanceof LFH) {
                lfh = (LFH) obj;
            } else {
                lfh = null;
            }
            if (lfh == null || !0qQ.A0K(this.A01, lfh.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public LFH(String str, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A04 = z3;
    }
}
