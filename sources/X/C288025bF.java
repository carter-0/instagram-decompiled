package X;

/* renamed from: X.5bF  reason: invalid class name and case insensitive filesystem */
public final class C288025bF {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C288025bF) || j != ((C288025bF) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A03(this.A00);
    }

    public /* synthetic */ C288025bF(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        if (j != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float A01(long j) {
        if (j != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float A02(long j) {
        if (j != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static String A03(long j) {
        if (j != 9205357640488583168L) {
            return 002.A0v("Size(", C392309ub.A00(A02(j)), ", ", C392309ub.A00(A00(j)), ')');
        }
        return "Size.Unspecified";
    }

    public static final boolean A04(long j) {
        if (j == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j2 = j & ((-((-9223372034707292160L & j) >>> 31)) ^ -1);
        if ((j2 & 4294967295L & (j2 >>> 32)) == 0) {
            return true;
        }
        return false;
    }
}
