package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gm2  reason: case insensitive filesystem */
public final class C53316Gm2 extends AnonymousClass0T0 {
    public final C62949Kp1 A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53316Gm2) {
                C53316Gm2 gm2 = (C53316Gm2) obj;
                if (!0qQ.A0K(this.A00, gm2.A00) || !0qQ.A0K(this.A02, gm2.A02) || !0qQ.A0K(this.A03, gm2.A03) || !0qQ.A0K(this.A05, gm2.A05) || !0qQ.A0K(this.A04, gm2.A04) || this.A0A != gm2.A0A || !0qQ.A0K(this.A01, gm2.A01) || !0qQ.A0K(this.A06, gm2.A06) || !0qQ.A0K(this.A07, gm2.A07) || this.A09 != gm2.A09 || this.A08 != gm2.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00));
        int A092 = AnonymousClass7TF.A09(this.A0A, (((AnonymousClass7TF.A08(this.A03, A082) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31);
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A07(this.A01, A092) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07)) * 31));
    }

    public C53316Gm2(C62949Kp1 kp1, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.A00 = kp1;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A0A = z;
        this.A01 = imageUrl;
        this.A06 = str5;
        this.A07 = str6;
        this.A09 = z2;
        this.A08 = z3;
    }
}
