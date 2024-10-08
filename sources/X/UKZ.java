package X;

public final class UKZ extends AnonymousClass0T0 {
    public final float A00;
    public final C18604Vux A01;
    public final boolean A02;
    public final boolean A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;

    public UKZ(C18604Vux vux, Integer num, String str, float f, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(num, 1);
        this.A04 = num;
        this.A05 = str;
        this.A00 = f;
        this.A01 = vux;
        this.A02 = z;
        this.A06 = z2;
        this.A03 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKZ) {
                UKZ ukz = (UKZ) obj;
                if (!(this.A04 == ukz.A04 && 0qQ.A0K(this.A05, ukz.A05) && Float.compare(this.A00, ukz.A00) == 0 && 0qQ.A0K(this.A01, ukz.A01) && this.A02 == ukz.A02 && this.A06 == ukz.A06 && this.A03 == ukz.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int A0D = C51971G9r.A0D(num, C18269Voj.A01(num)) * 31;
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A05, A0D), this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31)));
    }
}
