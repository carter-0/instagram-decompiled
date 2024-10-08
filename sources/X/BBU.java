package X;

import com.instagram.user.model.ProductDetailsProductItemDict;

public final class BBU extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final int A08;

    public BBU(C62565Khv khv, ProductDetailsProductItemDict productDetailsProductItemDict, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A08 = 0;
        AnonymousClass7TG.A1O(str, str2);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = productDetailsProductItemDict;
        this.A02 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A01 = khv;
    }

    public final boolean equals(Object obj) {
        if (this.A08 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BBU)) {
                return false;
            }
            BBU bbu = (BBU) obj;
            if (bbu.A08 != 1 || !0qQ.A0K(this.A02, bbu.A02) || !0qQ.A0K(this.A03, bbu.A03) || !0qQ.A0K(this.A04, bbu.A04) || !0qQ.A0K(this.A07, bbu.A07) || !0qQ.A0K(this.A06, bbu.A06) || !0qQ.A0K(this.A01, bbu.A01) || !0qQ.A0K(this.A00, bbu.A00) || !0qQ.A0K(this.A05, bbu.A05)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof BBU)) {
                return false;
            }
            BBU bbu2 = (BBU) obj;
            if (bbu2.A08 != 0 || !0qQ.A0K(this.A04, bbu2.A04) || !0qQ.A0K(this.A03, bbu2.A03) || !0qQ.A0K(this.A05, bbu2.A05) || !0qQ.A0K(this.A00, bbu2.A00) || !0qQ.A0K(this.A02, bbu2.A02) || !0qQ.A0K(this.A07, bbu2.A07) || !0qQ.A0K(this.A06, bbu2.A06) || this.A01 != bbu2.A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A082;
        int A0L;
        if (this.A08 != 0) {
            A082 = (((((((((AnonymousClass7TF.A08(this.A03, AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
            A0L = C41845B3m.A00(this.A05);
        } else {
            A082 = (((((((((AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04)) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A01);
        }
        return A082 + A0L;
    }

    public BBU() {
        this.A08 = 1;
        this.A08 = 1;
        String str = AnonymousClass57K.UNKNOWN.A00;
        this.A08 = 1;
        0qQ.A0B(str, 2);
        this.A02 = null;
        this.A03 = str;
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BBU(X.C62565Khv r3, com.instagram.user.model.ProductDetailsProductItemDict r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r2 = this;
            r0 = 0
            r2.A08 = r0
            r0 = r11 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r7 = r1
        L_0x0009:
            r0 = r11 & 8
            if (r0 == 0) goto L_0x000e
            r4 = r1
        L_0x000e:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0013
            r8 = r1
        L_0x0013:
            r0 = r11 & 32
            if (r0 == 0) goto L_0x0018
            r9 = r1
        L_0x0018:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x001d
            r10 = r1
        L_0x001d:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0022
            r3 = r1
        L_0x0022:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBU.<init>(X.Khv, com.instagram.user.model.ProductDetailsProductItemDict, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
