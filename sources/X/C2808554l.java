package X;

import java.util.Arrays;

/* renamed from: X.54l  reason: invalid class name and case insensitive filesystem */
public final class C2808554l {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2808554l)) {
            return false;
        }
        C2808554l r4 = (C2808554l) obj;
        return this.A00 == r4.A00 && this.A09.equals(r4.A09) && 2Ob.A00(this.A0A, r4.A0A) && 2Ob.A00(this.A0B, r4.A0B) && 2Ob.A00(this.A01, r4.A01) && 2Ob.A00(this.A08, r4.A08) && this.A05.equals(r4.A05) && 2Ob.A00(this.A06, r4.A06) && 2Ob.A00(this.A07, r4.A07) && this.A0C == r4.A0C && 2Ob.A00(this.A03, r4.A03) && this.A02.equals(r4.A02) && 2Ob.A00(this.A04, r4.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A09, this.A0A, this.A0B, this.A01, this.A08, this.A05, this.A06, this.A07, Boolean.valueOf(this.A0C), this.A03, this.A02, this.A04});
    }

    public C2808554l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, boolean z) {
        this.A00 = i;
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A01 = num;
        this.A08 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A0C = z;
        this.A03 = str8;
        this.A02 = str9;
        this.A04 = str10;
    }
}
