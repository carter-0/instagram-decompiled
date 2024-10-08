package X;

import java.util.Arrays;

public final class N35 extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public N35(Integer num, String str, String str2, String str3, String str4, byte[] bArr, long j, long j2) {
        C51973G9u.A0r(3, str, str2, str3);
        0qQ.A0B(str4, 7);
        this.A01 = j;
        this.A00 = j2;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = bArr;
        this.A04 = str4;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N35) {
                N35 n35 = (N35) obj;
                if (this.A01 != n35.A01 || this.A00 != n35.A00 || !0qQ.A0K(this.A03, n35.A03) || !0qQ.A0K(this.A06, n35.A06) || !0qQ.A0K(this.A05, n35.A05) || !0qQ.A0K(this.A07, n35.A07) || !0qQ.A0K(this.A04, n35.A04) || !0qQ.A0K(this.A02, n35.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A01;
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A01(this.A00, ((int) (j ^ (j >>> 32))) * 31))));
        byte[] bArr = this.A07;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return AnonymousClass7TF.A08(this.A04, (A08 + hashCode) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
