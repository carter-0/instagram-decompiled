package X;

import java.util.List;

/* renamed from: X.GmE  reason: case insensitive filesystem */
public final class C53328GmE extends AnonymousClass0T0 {
    public DSL A00;
    public 1Xj A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53328GmE) {
                C53328GmE gmE = (C53328GmE) obj;
                if (!0qQ.A0K(this.A09, gmE.A09) || !0qQ.A0K(this.A0B, gmE.A0B) || !0qQ.A0K(this.A03, gmE.A03) || !0qQ.A0K(this.A0E, gmE.A0E) || !0qQ.A0K(this.A01, gmE.A01) || !0qQ.A0K(this.A0D, gmE.A0D) || !0qQ.A0K(this.A0A, gmE.A0A) || !0qQ.A0K(this.A07, gmE.A07) || !0qQ.A0K(this.A05, gmE.A05) || !0qQ.A0K(this.A06, gmE.A06) || this.A0H != gmE.A0H || !0qQ.A0K(this.A04, gmE.A04) || !0qQ.A0K(this.A08, gmE.A08) || !0qQ.A0K(this.A00, gmE.A00) || !0qQ.A0K(this.A0F, gmE.A0F) || !0qQ.A0K(this.A0G, gmE.A0G) || !0qQ.A0K(this.A0C, gmE.A0C) || !0qQ.A0K(this.A02, gmE.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E2 = AnonymousClass7TG.A0E(this.A09) * 31;
        String str = this.A0E;
        return ((((((((((((AnonymousClass7TF.A09(this.A0H, (((((((((((AnonymousClass7TF.A08(str, (AnonymousClass7TF.A08(this.A0B, A0E2) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C53328GmE(DSL dsl, 1Xj r3, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, boolean z) {
        C51972G9s.A1C(str2, str3);
        this.A09 = str;
        this.A0B = str2;
        this.A03 = num;
        this.A0E = str3;
        this.A01 = r3;
        this.A0D = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A05 = str7;
        this.A06 = str8;
        this.A0H = z;
        this.A04 = l;
        this.A08 = str9;
        this.A00 = dsl;
        this.A0F = list;
        this.A0G = list2;
        this.A0C = str10;
        this.A02 = num2;
    }
}
