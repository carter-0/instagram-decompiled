package X;

import java.util.List;

/* renamed from: X.3f1  reason: invalid class name */
public final class AnonymousClass3f1 extends AnonymousClass0T0 {
    public final C67241sS A00;
    public final 1Xj A01;
    public final 1Xj A02;
    public final C250503lY A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3f1) {
                AnonymousClass3f1 r5 = (AnonymousClass3f1) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C250503lY r0 = this.A03;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A07;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.A0F;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A0A;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A08;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A0B;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0C;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A06;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C67241sS r02 = this.A00;
        int hashCode11 = (hashCode10 + (r02 == null ? 0 : r02.hashCode())) * 31;
        1Xj r03 = this.A01;
        int hashCode12 = (hashCode11 + (r03 == null ? 0 : r03.hashCode())) * 31;
        1Xj r04 = this.A02;
        int hashCode13 = (hashCode12 + (r04 == null ? 0 : r04.hashCode())) * 31;
        String str4 = this.A0D;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0E;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.A09;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode15 + i;
    }

    public AnonymousClass3f1(C67241sS r2, 1Xj r3, 1Xj r4, C250503lY r5, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list) {
        this.A03 = r5;
        this.A04 = bool;
        this.A07 = num;
        this.A0F = list;
        this.A0A = str;
        this.A08 = num2;
        this.A0B = str2;
        this.A0C = str3;
        this.A05 = bool2;
        this.A06 = bool3;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A0D = str4;
        this.A0E = str5;
        this.A09 = num3;
    }
}
