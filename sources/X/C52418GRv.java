package X;

import android.graphics.Path;

/* renamed from: X.GRv  reason: case insensitive filesystem */
public abstract class C52418GRv {
    public static final boolean A00(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        long j2 = AnonymousClass6GS.A00;
        float A01 = C51971G9r.A01(j);
        float A00 = AnonymousClass6GS.A00(j);
        return Dba.A1U(((((f5 * f5) / (A01 * A01)) + ((f6 * f6) / (A00 * A00))) > 1.0f ? 1 : ((((f5 * f5) / (A01 * A01)) + ((f6 * f6) / (A00 * A00))) == 1.0f ? 0 : -1)));
    }

    public static final boolean A01(C289315dO r26, float f, float f2) {
        C289315dO r1 = r26;
        float f3 = f;
        float f4 = f2;
        if (r1 instanceof C289305dN) {
            AnonymousClass5VN r12 = ((C289305dN) r1).A00;
            if (r12.A01 > f || f >= r12.A02 || r12.A03 > f2 || f2 >= r12.A00) {
                return false;
            }
            return true;
        } else if (r1 instanceof C3018460h) {
            AnonymousClass6GT r6 = ((C3018460h) r1).A00;
            float f5 = r6.A01;
            if (f < f5) {
                return false;
            }
            float f6 = r6.A02;
            if (f >= f6) {
                return false;
            }
            float f7 = r6.A03;
            if (f2 < f7) {
                return false;
            }
            float f8 = r6.A00;
            if (f2 >= f8) {
                return false;
            }
            long j = r6.A06;
            long j2 = AnonymousClass6GS.A00;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            long j3 = r6.A07;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float f9 = f6 - f5;
            if (intBitsToFloat + intBitsToFloat2 <= f9) {
                long j4 = r6.A04;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32));
                long j5 = r6.A05;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 >> 32));
                if (intBitsToFloat3 + intBitsToFloat4 <= f9) {
                    float A00 = AnonymousClass6GS.A00(j);
                    float A002 = AnonymousClass6GS.A00(j4);
                    float f10 = f8 - f7;
                    if (A00 + A002 <= f10) {
                        float A003 = AnonymousClass6GS.A00(j3);
                        float A004 = AnonymousClass6GS.A00(j5);
                        if (A003 + A004 <= f10) {
                            float f11 = intBitsToFloat + f5;
                            float f12 = A00 + f7;
                            float f13 = f6 - intBitsToFloat2;
                            float f14 = A003 + f7;
                            float f15 = f6 - intBitsToFloat4;
                            float f16 = f8 - A004;
                            float f17 = f8 - A002;
                            float f18 = intBitsToFloat3 + f5;
                            if (f < f11 && f2 < f12) {
                                return A00(f3, f4, f11, f12, j);
                            }
                            if (f < f18 && f2 > f17) {
                                return A00(f3, f4, f18, f17, j4);
                            }
                            if (f > f13 && f2 < f14) {
                                return A00(f3, f4, f13, f14, j3);
                            }
                            if (f <= f15 || f2 <= f16) {
                                return true;
                            }
                            return A00(f3, f4, f15, f16, j5);
                        }
                    }
                }
            }
            C3018160e A005 = C3026864w.A00();
            A005.AAA(r6, AnonymousClass05K.A00);
            return A02(A005, f3, f4);
        } else if (r1 instanceof C289335dQ) {
            return A02(((C289335dQ) r1).A00, f3, f4);
        } else {
            throw new RuntimeException();
        }
    }

    public static final boolean A02(C3018060d r3, float f, float f2) {
        AnonymousClass5VN r1 = new AnonymousClass5VN(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C3018160e A00 = C3026864w.A00();
        A00.AA1(r1, AnonymousClass05K.A00);
        C3018160e A002 = C3026864w.A00();
        A002.E0d(r3, A00, 1);
        Path path = A002.A03;
        boolean isEmpty = path.isEmpty();
        path.reset();
        A00.A03.reset();
        return !isEmpty;
    }
}
