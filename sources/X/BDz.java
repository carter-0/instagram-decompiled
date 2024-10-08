package X;

import java.util.List;

public final class BDz extends AnonymousClass0T0 implements DR3 {
    public final C67241sS A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDz) {
                BDz bDz = (BDz) obj;
                if (!0qQ.A0K(this.A07, bDz.A07) || !0qQ.A0K(this.A03, bDz.A03) || !0qQ.A0K(this.A08, bDz.A08) || !0qQ.A0K(this.A01, bDz.A01) || !0qQ.A0K(this.A04, bDz.A04) || !0qQ.A0K(this.A00, bDz.A00) || !0qQ.A0K(this.A05, bDz.A05) || !0qQ.A0K(this.A06, bDz.A06) || !0qQ.A0K(this.A02, bDz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A07));
        String str = this.A04;
        return AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A07(this.A08, A082) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31)) + AnonymousClass7TE.A0L(this.A02);
    }

    public BDz(C67241sS r2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list) {
        AnonymousClass7TG.A1U(str, str2, list);
        0qQ.A0B(str3, 5);
        AnonymousClass7TF.A1F(str4, 7, str5);
        this.A07 = str;
        this.A03 = str2;
        this.A08 = list;
        this.A01 = num;
        this.A04 = str3;
        this.A00 = r2;
        this.A05 = str4;
        this.A06 = str5;
        this.A02 = num2;
    }
}
