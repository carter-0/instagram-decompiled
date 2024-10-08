package X;

public final class BIV extends AnonymousClass0T0 implements DQT {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public BIV(Integer num, String str, String str2, boolean z) {
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A02 = z;
        this.A03 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIV) {
                BIV biv = (BIV) obj;
                if (this.A00 != biv.A00 || this.A02 != biv.A02 || !0qQ.A0K(this.A03, biv.A03) || !0qQ.A0K(this.A01, biv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A02, C44746CkF.A00(this.A00) * 31)));
    }
}
