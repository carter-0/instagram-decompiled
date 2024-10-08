package X;

import com.instagram.api.schemas.GraphGuardianContent;

/* renamed from: X.Drt  reason: case insensitive filesystem */
public final class C47178Drt extends AnonymousClass0T0 {
    public final int A00;
    public final C61074JwC A01;
    public final GraphGuardianContent A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass62P A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47178Drt) {
                C47178Drt drt = (C47178Drt) obj;
                if (this.A0A != drt.A0A || this.A09 != drt.A09 || !0qQ.A0K(this.A01, drt.A01) || !0qQ.A0K(this.A08, drt.A08) || this.A00 != drt.A00 || this.A0B != drt.A0B || !0qQ.A0K(this.A07, drt.A07) || !0qQ.A0K(this.A03, drt.A03) || !0qQ.A0K(this.A06, drt.A06) || !0qQ.A0K(this.A04, drt.A04) || !0qQ.A0K(this.A02, drt.A02) || !0qQ.A0K(this.A05, drt.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = i * 31;
        return ((((((((AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A09(this.A0B, (((((AnonymousClass7TF.A09(this.A09, i2) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + this.A00) * 31)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public C47178Drt(C61074JwC jwC, GraphGuardianContent graphGuardianContent, Integer num, Integer num2, Integer num3, String str, String str2, AnonymousClass62P r8, int i, boolean z, boolean z2, boolean z3) {
        this.A0A = z;
        this.A09 = z2;
        this.A01 = jwC;
        this.A08 = r8;
        this.A00 = i;
        this.A0B = z3;
        this.A07 = str;
        this.A03 = num;
        this.A06 = str2;
        this.A04 = num2;
        this.A02 = graphGuardianContent;
        this.A05 = num3;
    }

    public C47178Drt() {
        this((C61074JwC) null, (GraphGuardianContent) null, (Integer) null, (Integer) null, (Integer) null, "", (String) null, (AnonymousClass62P) null, 0, true, false, false);
    }
}
