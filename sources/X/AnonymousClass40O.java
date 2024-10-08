package X;

/* renamed from: X.40O  reason: invalid class name */
public final class AnonymousClass40O extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Float A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public AnonymousClass40O(Float f, Integer num, Long l, String str, String str2, String str3, int i, int i2, long j, long j2) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A08 = str;
        this.A03 = j;
        this.A05 = num;
        this.A07 = str2;
        this.A01 = i2;
        this.A06 = l;
        this.A04 = f;
        this.A09 = str3;
        this.A02 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass40O) {
                AnonymousClass40O r8 = (AnonymousClass40O) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A08, r8.A08) || this.A03 != r8.A03 || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A07, r8.A07) || this.A01 != r8.A01 || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A09, r8.A09) || this.A02 != r8.A02) {
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
        int hashCode4;
        long j = this.A03;
        int hashCode5 = ((((this.A00 * 31) + this.A08.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Integer num = this.A05;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.A01) * 31;
        Long l = this.A06;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Float f = this.A04;
        if (f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.A09;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j2 = this.A02;
        return ((i5 + i) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
