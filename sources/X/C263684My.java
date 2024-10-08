package X;

/* renamed from: X.4My  reason: invalid class name and case insensitive filesystem */
public final class C263684My {
    public static final C263684My A0D = new C263684My((String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C263684My)) {
            return false;
        }
        C263684My r7 = (C263684My) obj;
        return r7.A03 == this.A03 && r7.A00 == this.A00 && r7.A07 == this.A07 && r7.A06 == this.A06 && r7.A08 == this.A08 && r7.A02 == this.A02 && r7.A09 == this.A09 && r7.A01 == this.A01 && r7.A0B == this.A0B && r7.A04 == this.A04 && r7.A05 == this.A05 && r7.A0C == this.A0C;
    }

    public final int hashCode() {
        long j;
        long j2 = this.A03;
        int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = (long) this.A00;
        long j4 = this.A07;
        long j5 = this.A06;
        long j6 = this.A08;
        long j7 = this.A02;
        long j8 = this.A09;
        long j9 = this.A01;
        int i2 = (((((((((((((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = 1;
        if (this.A0B) {
            j = 1;
        } else {
            j = 0;
        }
        long j11 = this.A04;
        long j12 = this.A05;
        int i3 = (((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        if (!this.A0C) {
            j10 = 0;
        }
        return i3 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public C263684My(String str, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        this.A03 = j;
        this.A00 = i;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A09 = j6;
        this.A01 = j7;
        this.A0B = z;
        this.A04 = j8;
        this.A05 = j9;
        this.A0C = z2;
        this.A0A = str;
    }
}
