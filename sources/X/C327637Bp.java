package X;

/* renamed from: X.7Bp  reason: invalid class name and case insensitive filesystem */
public final class C327637Bp extends AnonymousClass0T0 implements Comparable {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C327637Bp) {
                C327637Bp r8 = (C327637Bp) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0Y("ThreadRowTimestamp(primaryTimestamp=", ", secondaryTimestamp=", ')', this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C327637Bp r6 = (C327637Bp) obj;
        0qQ.A0B(r6, 0);
        long j = this.A00;
        long j2 = r6.A00;
        if (j == j2) {
            j = this.A01;
            j2 = r6.A01;
        }
        return 0qQ.A01(j, j2);
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C327637Bp(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
