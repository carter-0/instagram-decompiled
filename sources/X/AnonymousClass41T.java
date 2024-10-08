package X;

/* renamed from: X.41T  reason: invalid class name */
public final class AnonymousClass41T extends AnonymousClass0T0 {
    public long A00;
    public long A01;
    public C13879Tj0 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final long A0B;

    public AnonymousClass41T(C13879Tj0 tj0, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str4, 5);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = tj0;
        this.A08 = str4;
        this.A0B = j;
        this.A06 = str5;
        this.A09 = z;
        this.A00 = j2;
        this.A01 = j3;
        this.A0A = z2;
        this.A07 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41T) {
                AnonymousClass41T r8 = (AnonymousClass41T) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A08, r8.A08) || this.A0B != r8.A0B || !0qQ.A0K(this.A06, r8.A06) || this.A09 != r8.A09 || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A0A != r8.A0A || !0qQ.A0K(this.A07, r8.A07)) {
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
        int hashCode4 = ((this.A03.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        C13879Tj0 tj0 = this.A02;
        if (tj0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = tj0.hashCode();
        }
        long j = this.A0B;
        int hashCode5 = (((((i2 + hashCode2) * 31) + this.A08.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (hashCode5 + hashCode3) * 31;
        int i4 = 1237;
        if (this.A09) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        long j2 = this.A00;
        long j3 = this.A01;
        int i6 = (((i5 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        String str3 = this.A07;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i8 + i;
    }
}
