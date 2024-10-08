package X;

/* renamed from: X.GlN  reason: case insensitive filesystem */
public final class C53275GlN extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53275GlN) {
                C53275GlN glN = (C53275GlN) obj;
                if (!(this.A00 == glN.A00 && this.A01 == glN.A01 && this.A03 == glN.A03 && this.A02 == glN.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A04;
        int A012 = G9w.A01(AnonymousClass7TF.A09(this.A03, ((this.A00 * 31) + this.A01) * 31));
        Integer num = this.A02;
        if (num == null) {
            A04 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "SHOWN_HIGHLIGHTED";
                    break;
                case 2:
                    str = "SHOWN_MIDSCENE";
                    break;
                case 3:
                    str = "NOT_SHOWN";
                    break;
                default:
                    str = "SHOWN_NOT_HIGHLIGHTED";
                    break;
            }
            A04 = C51966G9m.A04(str, intValue);
        }
        return A012 + A04;
    }

    public C53275GlN(Integer num, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = num;
    }
}
