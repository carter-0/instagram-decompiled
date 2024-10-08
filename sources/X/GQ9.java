package X;

public final class GQ9 {
    public final long A00;

    public static /* synthetic */ long A01(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = C51971G9r.A01(j);
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final long A02(long j, long j2) {
        float A002 = C51968G9o.A00(j) - C51968G9o.A00(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(A002)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L);
    }

    public static final long A03(long j, long j2) {
        float A002 = C51968G9o.A00(j) + C51968G9o.A00(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(A002)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L);
    }

    public static GQ9 A04() {
        return new GQ9(0);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof GQ9) || j != ((GQ9) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('(');
        A1A.append(C51971G9r.A01(j));
        A1A.append(", ");
        A1A.append(C51972G9s.A00(j));
        return AnonymousClass7TF.A0l(") px/sec", A1A);
    }

    public /* synthetic */ GQ9(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return C51972G9s.A00(j);
    }
}
