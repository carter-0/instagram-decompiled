package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.5vJ  reason: invalid class name and case insensitive filesystem */
public final class C299505vJ extends AnonymousClass0T0 {
    public final LineType A00;
    public final C299495vH A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C299505vJ(LineType lineType, C299495vH r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A06 = str;
        this.A07 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A02 = str6;
        this.A08 = str7;
        this.A0A = z;
        this.A0D = z2;
        this.A09 = z3;
        this.A01 = r3;
        this.A00 = lineType;
        this.A0B = z4;
        this.A0C = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299505vJ) {
                C299505vJ r5 = (C299505vJ) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || this.A0A != r5.A0A || this.A0D != r5.A0D || this.A09 != r5.A09 || this.A01 != r5.A01 || this.A00 != r5.A00 || this.A0B != r5.A0B || this.A0C != r5.A0C) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.A06.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31 * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31 * 31;
        String str4 = this.A08;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int A002 = (((i4 + i) * 31) + C54732HQn.A00()) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        int i6 = (A002 + i5) * 31;
        int i7 = 1237;
        if (this.A0D) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A09) {
            i9 = 1231;
        }
        int hashCode5 = (((((i8 + i9) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i10 = 1237;
        if (this.A0B) {
            i10 = 1231;
        }
        int i11 = (hashCode5 + i10) * 31;
        int i12 = 1237;
        if (this.A0C) {
            i12 = 1231;
        }
        return i11 + i12;
    }
}
