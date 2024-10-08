package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* renamed from: X.Jud  reason: case insensitive filesystem */
public final class C60981Jud extends AnonymousClass0T0 {
    public final IGCreatorIncentiveProgram A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C60981Jud(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        C51973G9u.A0s(6, str3, str4, str5);
        C51972G9s.A1F(str7, iGCreatorIncentiveProgram);
        0qQ.A0B(str9, 15);
        this.A03 = str;
        this.A07 = num;
        this.A01 = num2;
        this.A08 = num3;
        this.A09 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A06 = str7;
        this.A00 = iGCreatorIncentiveProgram;
        this.A0E = z;
        this.A02 = num4;
        this.A0C = str8;
        this.A0D = str9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60981Jud) {
                C60981Jud jud = (C60981Jud) obj;
                if (!0qQ.A0K(this.A03, jud.A03) || !0qQ.A0K(this.A07, jud.A07) || !0qQ.A0K(this.A01, jud.A01) || !0qQ.A0K(this.A08, jud.A08) || !0qQ.A0K(this.A09, jud.A09) || !0qQ.A0K(this.A04, jud.A04) || !0qQ.A0K(this.A05, jud.A05) || !0qQ.A0K(this.A0A, jud.A0A) || !0qQ.A0K(this.A0B, jud.A0B) || !0qQ.A0K(this.A06, jud.A06) || this.A00 != jud.A00 || this.A0E != jud.A0E || !0qQ.A0K(this.A02, jud.A02) || !0qQ.A0K(this.A0C, jud.A0C) || !0qQ.A0K(this.A0D, jud.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, ((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31));
        int A072 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A06, (AnonymousClass7TF.A08(this.A0A, A082) + AnonymousClass7TG.A0E(this.A0B)) * 31));
        return C41845B3m.A01(this.A0D, (((AnonymousClass7TF.A09(this.A0E, A072) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A0C)) * 31);
    }
}
