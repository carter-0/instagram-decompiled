package X;

import com.instagram.user.model.User;

/* renamed from: X.GmF  reason: case insensitive filesystem */
public final class C53329GmF extends AnonymousClass0T0 {
    public final int A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53329GmF) {
                C53329GmF gmF = (C53329GmF) obj;
                if (!0qQ.A0K(this.A01, gmF.A01) || this.A00 != gmF.A00 || !0qQ.A0K(this.A07, gmF.A07) || !0qQ.A0K(this.A06, gmF.A06) || !0qQ.A0K(this.A08, gmF.A08) || !0qQ.A0K(this.A0A, gmF.A0A) || !0qQ.A0K(this.A0B, gmF.A0B) || !0qQ.A0K(this.A09, gmF.A09) || !0qQ.A0K(this.A0G, gmF.A0G) || !0qQ.A0K(this.A0F, gmF.A0F) || this.A05 != gmF.A05 || !0qQ.A0K(this.A04, gmF.A04) || this.A0H != gmF.A0H || this.A0C != gmF.A0C || this.A0D != gmF.A0D || this.A0E != gmF.A0E || !0qQ.A0K(this.A03, gmF.A03) || !0qQ.A0K(this.A02, gmF.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53329GmF(User user, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 11);
        this.A01 = user;
        this.A00 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A09 = str6;
        this.A0G = str7;
        this.A0F = str8;
        this.A05 = num;
        this.A04 = num2;
        this.A0H = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A03 = bool;
        this.A02 = bool2;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A07, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31));
        String str = this.A0B;
        return ((AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0H, (((((((((AnonymousClass7TF.A08(str, (AnonymousClass7TF.A08(this.A08, A082) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + C49013Enp.A00(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)))) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
