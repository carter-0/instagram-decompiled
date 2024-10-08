package X;

/* renamed from: X.5dm  reason: invalid class name and case insensitive filesystem */
public final class C289545dm extends AnonymousClass0T0 {
    public final float A00 = 5.0f;
    public final float A01 = 6.0f;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C289545dm) {
                C289545dm r9 = (C289545dm) obj;
                if (C289095d0.A01(this.A01, r9.A01) && C289095d0.A01(this.A00, r9.A00)) {
                    long j = this.A02;
                    long j2 = r9.A02;
                    long j3 = AnonymousClass5RW.A01;
                    if (!(j == j2 && this.A03 == r9.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C289545dm(long j, long j2) {
        this.A02 = j;
        this.A03 = j2;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AnonymousClass5RW.A01;
        long j3 = this.A03;
        return (((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
