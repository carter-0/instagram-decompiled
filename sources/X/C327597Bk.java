package X;

/* renamed from: X.7Bk  reason: invalid class name and case insensitive filesystem */
public final class C327597Bk extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C327597Bk) {
                C327597Bk r8 = (C327597Bk) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = this.A01;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.A00) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C327597Bk(long j, int i, long j2) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = j2;
    }
}
