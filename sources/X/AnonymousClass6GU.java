package X;

/* renamed from: X.6GU  reason: invalid class name */
public abstract class AnonymousClass6GU {
    public static final AnonymousClass6GT A00(float f, float f2, float f3, float f4, long j) {
        long j2 = AnonymousClass6GS.A00;
        long A00 = AnonymousClass6GR.A00(Float.intBitsToFloat((int) (j >> 32)), AnonymousClass6GS.A00(j));
        return new AnonymousClass6GT(f, f2, f3, f4, A00, A00, A00, A00);
    }

    public static final boolean A01(AnonymousClass6GT r8) {
        long j = r8.A06;
        long j2 = AnonymousClass6GS.A00;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat != AnonymousClass6GS.A00(j)) {
            return false;
        }
        long j3 = r8.A07;
        if (intBitsToFloat != Float.intBitsToFloat((int) (j3 >> 32)) || intBitsToFloat != AnonymousClass6GS.A00(j3)) {
            return false;
        }
        long j4 = r8.A05;
        if (intBitsToFloat != Float.intBitsToFloat((int) (j4 >> 32)) || intBitsToFloat != AnonymousClass6GS.A00(j4)) {
            return false;
        }
        long j5 = r8.A04;
        if (intBitsToFloat == Float.intBitsToFloat((int) (j5 >> 32)) && intBitsToFloat == AnonymousClass6GS.A00(j5)) {
            return true;
        }
        return false;
    }
}
