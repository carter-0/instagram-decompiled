package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.4lF  reason: invalid class name and case insensitive filesystem */
public final class C272714lF extends AnonymousClass0T0 implements AnonymousClass4ZG {
    public final C67241sS A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Boolean A08;
    public final String A09;
    public final HashMap A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272714lF) {
                C272714lF r5 = (C272714lF) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.A07;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C67241sS r0 = this.A00;
        int hashCode8 = (hashCode7 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HashMap hashMap = this.A0A;
        int hashCode10 = (hashCode9 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        Integer num2 = this.A03;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode10 + i;
    }

    public C272714lF(C67241sS r1, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, HashMap hashMap, List list) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = bool;
        this.A09 = str3;
        this.A02 = num;
        this.A07 = list;
        this.A06 = str4;
        this.A00 = r1;
        this.A08 = bool2;
        this.A0A = hashMap;
        this.A03 = num2;
    }
}
