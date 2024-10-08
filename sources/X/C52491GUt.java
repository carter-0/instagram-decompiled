package X;

/* renamed from: X.GUt  reason: case insensitive filesystem */
public final class C52491GUt extends HQI {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52491GUt) {
                C52491GUt gUt = (C52491GUt) obj;
                if (!0qQ.A0K(this.A01, gUt.A01) || this.A00 != gUt.A00 || !0qQ.A0K(this.A02, gUt.A02) || this.A03 != gUt.A03) {
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
        int A0O = AnonymousClass7TE.A0O(this.A01);
        Integer num = this.A00;
        if (num == null) {
            A04 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "BANNER_AD_SHOWN";
            } else {
                str = "DEFAULT";
            }
            A04 = C51966G9m.A04(str, intValue);
        }
        return DbS.A06(this.A03, AnonymousClass7TF.A08(this.A02, (A0O + A04) * 31));
    }

    public C52491GUt(Integer num, String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A03 = z;
    }
}
