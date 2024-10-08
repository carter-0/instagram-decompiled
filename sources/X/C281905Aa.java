package X;

import java.util.List;

/* renamed from: X.5Aa  reason: invalid class name and case insensitive filesystem */
public final class C281905Aa extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final int A0A;
    public final C281925Ac A0B;
    public final C281915Ab A0C;
    public final String A0D;

    public C281905Aa(C281925Ac r2, C281915Ab r3, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(list, 3);
        0qQ.A0B(str3, 5);
        0qQ.A0B(list2, 6);
        0qQ.A0B(list3, 7);
        0qQ.A0B(list4, 10);
        0qQ.A0B(str5, 11);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list;
        this.A0C = r3;
        this.A04 = str3;
        this.A07 = list2;
        this.A08 = list3;
        this.A0D = str4;
        this.A0A = i;
        this.A09 = list4;
        this.A05 = str5;
        this.A00 = i2;
        this.A0B = r2;
        this.A01 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C281905Aa) {
                C281905Aa r5 = (C281905Aa) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0D, r5.A0D) || this.A0A != r5.A0A || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00 || !0qQ.A0K(this.A0B, r5.A0B) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31;
        C281915Ab r0 = this.A0C;
        int i = 0;
        int hashCode2 = (((((((hashCode + (r0 == null ? 0 : r0.hashCode())) * 31) + this.A04.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31;
        String str = this.A0D;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.A0A) * 31) + this.A09.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A00) * 31;
        C281925Ac r02 = this.A0B;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.A01;
    }
}
