package X;

/* renamed from: X.48E  reason: invalid class name */
public final class AnonymousClass48E extends AnonymousClass0T0 {
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public AnonymousClass48E(String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, long j4) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 7);
        0qQ.A0B(str5, 10);
        this.A02 = i;
        this.A06 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A03 = j;
        this.A00 = j2;
        this.A07 = str4;
        this.A04 = j3;
        this.A01 = j4;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass48E) {
                AnonymousClass48E r8 = (AnonymousClass48E) obj;
                if (this.A02 != r8.A02 || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A09, r8.A09) || this.A03 != r8.A03 || this.A00 != r8.A00 || !0qQ.A0K(this.A07, r8.A07) || this.A04 != r8.A04 || this.A01 != r8.A01 || !0qQ.A0K(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = this.A00;
        long j3 = this.A04;
        long j4 = this.A01;
        return (((((((((((((((((this.A02 * 31) + this.A06.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A07.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A05.hashCode();
    }
}
