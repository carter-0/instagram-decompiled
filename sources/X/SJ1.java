package X;

import com.facebookpay.otc.models.OtcInput;

public final class SJ1 {
    public final OtcInput A00;
    public final String A01;

    public static SJ1 A00(C298525tb r1, QDH qdh, String str) {
        return new SJ1(qdh.A02(r1, true), str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SJ1) {
                SJ1 sj1 = (SJ1) obj;
                if (!0qQ.A0K(this.A01, sj1.A01) || !0qQ.A0K(this.A00, sj1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public SJ1(OtcInput otcInput, String str) {
        this.A01 = str;
        this.A00 = otcInput;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductComponent(productId=");
        A1A.append(this.A01);
        A1A.append(", otcInput=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
