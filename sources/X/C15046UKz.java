package X;

import org.json.JSONObject;

/* renamed from: X.UKz  reason: case insensitive filesystem */
public final class C15046UKz extends AnonymousClass0T0 {
    public C16540Uwl A00;
    public C53368Gms A01;
    public JSONObject A02;
    public boolean A03;
    public final UL7 A04;
    public final Boolean A05;
    public final Double A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final boolean A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15046UKz) {
                C15046UKz uKz = (C15046UKz) obj;
                if (!0qQ.A0K(this.A09, uKz.A09) || !0qQ.A0K(this.A0B, uKz.A0B) || !0qQ.A0K(this.A0A, uKz.A0A) || !0qQ.A0K(this.A04, uKz.A04) || !0qQ.A0K(this.A06, uKz.A06) || this.A0E != uKz.A0E || this.A0K != uKz.A0K || this.A00 != uKz.A00 || this.A03 != uKz.A03 || !0qQ.A0K(this.A01, uKz.A01) || !0qQ.A0K(this.A02, uKz.A02) || this.A0F != uKz.A0F || this.A0D != uKz.A0D || this.A0C != uKz.A0C || !0qQ.A0K(this.A08, uKz.A08) || !0qQ.A0K(this.A07, uKz.A07) || !0qQ.A0K(this.A05, uKz.A05) || !0qQ.A0K(this.A0H, uKz.A0H) || !0qQ.A0K(this.A0J, uKz.A0J) || !0qQ.A0K(this.A0G, uKz.A0G) || !0qQ.A0K(this.A0I, uKz.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TG.A0E(this.A09) * 31));
        int A072 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0E, (AnonymousClass7TF.A07(this.A04, A082) + AnonymousClass7TG.A0C(this.A06)) * 31)));
        return ((((((((((((((AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0F, (((AnonymousClass7TF.A09(this.A03, A072) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31))) + C54732HQn.A00()) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31 * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TE.A0L(this.A0I);
    }

    public C15046UKz(C16540Uwl uwl, UL7 ul7, C53368Gms gms, Boolean bool, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51972G9s.A1C(str2, ul7);
        0qQ.A0B(uwl, 8);
        this.A09 = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A04 = ul7;
        this.A06 = d;
        this.A0E = z;
        this.A0K = z2;
        this.A00 = uwl;
        this.A03 = z3;
        this.A01 = gms;
        this.A02 = jSONObject;
        this.A0F = z4;
        this.A0D = z5;
        this.A0C = z6;
        this.A08 = str4;
        this.A07 = num;
        this.A05 = bool;
        this.A0H = num2;
        this.A0J = num3;
        this.A0G = num4;
        this.A0I = num5;
    }
}
