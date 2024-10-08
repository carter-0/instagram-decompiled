package X;

import java.util.Arrays;

/* renamed from: X.8xC  reason: invalid class name and case insensitive filesystem */
public final class C370868xC extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final byte[] A0A;

    public C370868xC(Integer num, Integer num2, Integer num3, String str, String str2, String str3, byte[] bArr, int i, long j, long j2, boolean z) {
        0qQ.A0B(str, 3);
        0qQ.A0B(str2, 4);
        0qQ.A0B(str3, 8);
        this.A02 = j;
        this.A01 = j2;
        this.A06 = str;
        this.A08 = str2;
        this.A0A = bArr;
        this.A09 = z;
        this.A00 = i;
        this.A07 = str3;
        this.A05 = num;
        this.A03 = num2;
        this.A04 = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C370868xC) {
                C370868xC r8 = (C370868xC) obj;
                if (this.A02 != r8.A02 || this.A01 != r8.A01 || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A0A, r8.A0A) || this.A09 != r8.A09 || this.A00 != r8.A00 || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04)) {
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
        long j = this.A02;
        long j2 = this.A01;
        int hashCode4 = ((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A06.hashCode()) * 31) + this.A08.hashCode()) * 31;
        byte[] bArr = this.A0A;
        int i = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int hashCode5 = (((((i2 + i3) * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        Integer num = this.A05;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (hashCode5 + hashCode2) * 31;
        Integer num2 = this.A03;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Integer num3 = this.A04;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i5 + i;
    }
}
