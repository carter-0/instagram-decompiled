package X;

/* renamed from: X.Glf  reason: case insensitive filesystem */
public final class C53293Glf extends AnonymousClass0T0 {
    public final int A00;
    public final N49 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53293Glf) {
                C53293Glf glf = (C53293Glf) obj;
                if (!0qQ.A0K(this.A03, glf.A03) || !0qQ.A0K(this.A04, glf.A04) || !0qQ.A0K(this.A05, glf.A05) || this.A00 != glf.A00 || this.A06 != glf.A06 || this.A02 != glf.A02 || !0qQ.A0K(this.A01, glf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A042;
        int A0O = AnonymousClass7TE.A0O(this.A03);
        int A012 = G9w.A01(AnonymousClass7TF.A09(this.A06, ((G9w.A02(AnonymousClass7TF.A08(this.A04, A0O), AnonymousClass7TG.A0E(this.A05)) * 31) + this.A00) * 31));
        Integer num = this.A02;
        if (num == null) {
            A042 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "Reply";
            } else {
                str = "Parent";
            }
            A042 = C51966G9m.A04(str, intValue);
        }
        return (G9w.A02(A012, A042) * 31 * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C53293Glf(N49 n49, Integer num, String str, String str2, String str3, int i, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = z;
        this.A02 = num;
        this.A01 = n49;
    }
}
