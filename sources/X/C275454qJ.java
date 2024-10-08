package X;

import java.util.List;

/* renamed from: X.4qJ  reason: invalid class name and case insensitive filesystem */
public final class C275454qJ extends AnonymousClass0T0 {
    public final C67241sS A00;
    public final AnonymousClass508 A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final AnonymousClass3HX A0D;
    public final Integer A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275454qJ) {
                C275454qJ r5 = (C275454qJ) obj;
                if (!0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A0E;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        AnonymousClass508 r0 = this.A01;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str = this.A07;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C67241sS r02 = this.A00;
        int hashCode7 = (hashCode6 + (r02 == null ? 0 : r02.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AnonymousClass3HX r03 = this.A0D;
        int hashCode9 = (hashCode8 + (r03 == null ? 0 : r03.hashCode())) * 31;
        List list = this.A0B;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0C;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.A05;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A06;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode14 + i;
    }

    public C275454qJ(C67241sS r1, AnonymousClass508 r2, AnonymousClass3HX r3, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, List list2) {
        this.A0E = num;
        this.A01 = r2;
        this.A07 = str;
        this.A04 = num2;
        this.A02 = bool;
        this.A08 = str2;
        this.A00 = r1;
        this.A03 = bool2;
        this.A0D = r3;
        this.A0B = list;
        this.A0C = list2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = num3;
        this.A06 = num4;
    }
}
