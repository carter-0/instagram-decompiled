package X;

import java.util.List;

/* renamed from: X.BHl  reason: case insensitive filesystem */
public final class C42108BHl extends AnonymousClass0T0 implements C51944G8n {
    public final DRA A00;
    public final DRW A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42108BHl) {
                C42108BHl bHl = (C42108BHl) obj;
                if (!0qQ.A0K(this.A03, bHl.A03) || !0qQ.A0K(this.A02, bHl.A02) || !0qQ.A0K(this.A08, bHl.A08) || !0qQ.A0K(this.A09, bHl.A09) || !0qQ.A0K(this.A0A, bHl.A0A) || !0qQ.A0K(this.A0B, bHl.A0B) || !0qQ.A0K(this.A04, bHl.A04) || !0qQ.A0K(this.A05, bHl.A05) || !0qQ.A0K(this.A0C, bHl.A0C) || !0qQ.A0K(this.A00, bHl.A00) || !0qQ.A0K(this.A0D, bHl.A0D) || !0qQ.A0K(this.A06, bHl.A06) || !0qQ.A0K(this.A0E, bHl.A0E) || !0qQ.A0K(this.A07, bHl.A07) || !0qQ.A0K(this.A0F, bHl.A0F) || !0qQ.A0K(this.A01, bHl.A01) || !0qQ.A0K(this.A0I, bHl.A0I) || this.A0K != bHl.A0K || !0qQ.A0K(this.A0G, bHl.A0G) || !0qQ.A0K(this.A0J, bHl.A0J) || !0qQ.A0K(this.A0H, bHl.A0H)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C42108BHl(DRA dra, DRW drw, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, boolean z) {
        String str11 = str6;
        0qQ.A0B(str11, 11);
        String str12 = str7;
        0qQ.A0B(str12, 13);
        this.A03 = num;
        this.A02 = bool;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A04 = num2;
        this.A05 = num3;
        this.A0C = str5;
        this.A00 = dra;
        this.A0D = str11;
        this.A06 = num4;
        this.A0E = str12;
        this.A07 = num5;
        this.A0F = str8;
        this.A01 = drw;
        this.A0I = list;
        this.A0K = z;
        this.A0G = str9;
        this.A0J = list2;
        this.A0H = str10;
    }

    public final String getName() {
        return this.A0E;
    }

    public final int hashCode() {
        String str = this.A0D;
        String str2 = this.A0E;
        return ((((AnonymousClass7TF.A09(this.A0K, (((((((AnonymousClass7TF.A08(str2, (AnonymousClass7TF.A08(str, ((((((((((((((((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31) + C41845B3m.A00(this.A0H);
    }
}
