package X;

/* renamed from: X.5Z7  reason: invalid class name */
public abstract class AnonymousClass5Z7 {
    public static final long A01(int i) {
        return A00((float) i, 4294967296L);
    }

    public static final boolean A02(long j) {
        AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
        if ((j & 1095216660480L) == 0) {
            return true;
        }
        return false;
    }

    public static final long A00(float f, long j) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
        return floatToIntBits;
    }
}
