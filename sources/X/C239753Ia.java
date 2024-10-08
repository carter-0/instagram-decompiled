package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.util.List;

/* renamed from: X.3Ia  reason: invalid class name and case insensitive filesystem */
public final class C239753Ia extends AnonymousClass0T0 implements C239763Ib {
    public final C239773Ic A00;
    public final IGUserHighlightsTrayType A01;
    public final AnonymousClass3If A02;
    public final AnonymousClass3IY A03;
    public final AnonymousClass3HX A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;

    public final C239753Ia FEs(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239753Ia) {
                C239753Ia r5 = (C239753Ia) obj;
                if (!0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A05, r5.A05) || this.A01 != r5.A01 || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0J, r5.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A0G;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A0D;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C239773Ic r0 = this.A00;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str2 = this.A0E;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        IGUserHighlightsTrayType iGUserHighlightsTrayType = this.A01;
        int hashCode6 = (hashCode5 + (iGUserHighlightsTrayType == null ? 0 : iGUserHighlightsTrayType.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A09;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0A;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.A0B;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        AnonymousClass3IY r02 = this.A03;
        int hashCode12 = (hashCode11 + (r02 == null ? 0 : r02.hashCode())) * 31;
        Integer num4 = this.A0C;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list2 = this.A0H;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0I;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AnonymousClass3HX r03 = this.A04;
        int hashCode16 = (hashCode15 + (r03 == null ? 0 : r03.hashCode())) * 31;
        AnonymousClass3If r04 = this.A02;
        int hashCode17 = (hashCode16 + (r04 == null ? 0 : r04.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.A0F;
        int hashCode19 = (hashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.A0J;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode19 + i;
    }

    public final List Ai9() {
        return this.A0G;
    }

    public final String AiL() {
        return this.A0D;
    }

    public final C239783Id Anb() {
        return this.A00;
    }

    public final String Aum() {
        return this.A0E;
    }

    public final Boolean BBg() {
        return this.A05;
    }

    public final IGUserHighlightsTrayType BDd() {
        return this.A01;
    }

    public final Integer BOc() {
        return this.A09;
    }

    public final Integer BOd() {
        return this.A0A;
    }

    public final Boolean BVG() {
        return this.A07;
    }

    public final Integer BWG() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3IZ Bbv() {
        return this.A03;
    }

    public final Integer BlD() {
        return this.A0C;
    }

    public final List BlR() {
        return this.A0H;
    }

    public final List BoB() {
        return this.A0I;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3HY Bs3() {
        return this.A04;
    }

    public final AnonymousClass3Ig BtP() {
        return this.A02;
    }

    public final Boolean C03() {
        return this.A08;
    }

    public final String C14() {
        return this.A0F;
    }

    public final List C9k() {
        return this.A0J;
    }

    public final Boolean Cci() {
        return this.A06;
    }

    public C239753Ia(C239773Ic r2, IGUserHighlightsTrayType iGUserHighlightsTrayType, AnonymousClass3If r4, AnonymousClass3IY r5, AnonymousClass3HX r6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4) {
        this.A0G = list;
        this.A0D = str;
        this.A00 = r2;
        this.A0E = str2;
        this.A05 = bool;
        this.A01 = iGUserHighlightsTrayType;
        this.A06 = bool2;
        this.A09 = num;
        this.A0A = num2;
        this.A07 = bool3;
        this.A0B = num3;
        this.A03 = r5;
        this.A0C = num4;
        this.A0H = list2;
        this.A0I = list3;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = bool4;
        this.A0F = str3;
        this.A0J = list4;
    }
}
