package X;

/* renamed from: X.5cr  reason: invalid class name and case insensitive filesystem */
public final class C289005cr {
    public final long A00;

    public static final int A00(long j) {
        return (int) (j & 4294967295L);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C289005cr) || j != ((C289005cr) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.A00;
        return 002.A0P(" x ", (int) (j >> 32), A00(j));
    }

    public /* synthetic */ C289005cr(long j) {
        this.A00 = j;
    }
}
