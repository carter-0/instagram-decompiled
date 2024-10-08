package X;

import java.math.RoundingMode;

/* renamed from: X.Q1h  reason: case insensitive filesystem */
public abstract class C7258Q1h {
    public static final long[][] A00 = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};
    public static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    public static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    public static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    public static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    public static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    public static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    public static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    public static long A00(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean A1T = C51970G9q.A1T(((j ^ j2) > 0 ? 1 : ((j ^ j2) == 0 ? 0 : -1)));
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (A1T || z) {
            return j3;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("overflow: ");
        A1A.append("checkedAdd");
        A1A.append("(");
        A1A.append(j);
        Pxe.A1Y(A1A);
        A1A.append(j2);
        throw new ArithmeticException(AnonymousClass7TF.A0l(")", A1A));
    }

    public static long A01(long j, long j2) {
        if (j < 0) {
            throw AnonymousClass7TE.A0w(002.A0s("a", " (", ") must be >= 0", j));
        } else if (j2 < 0) {
            throw AnonymousClass7TE.A0w(002.A0s("b", " (", ") must be >= 0", j2));
        } else if (j == 0) {
            return j2;
        } else {
            if (j2 == 0) {
                return j;
            }
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
            long j3 = j >> numberOfTrailingZeros;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
            long j4 = j2 >> numberOfTrailingZeros2;
            while (j3 != j4) {
                long j5 = j3 - j4;
                long j6 = (j5 >> 63) & j5;
                long j7 = (j5 - j6) - j6;
                j4 += j6;
                j3 = j7 >> Long.numberOfTrailingZeros(j7);
            }
            return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
        }
    }

    public static long A03(RoundingMode roundingMode, long j, long j2) {
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (C10011Rl6.A00[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + ((long) i);
    }

    public static long A02(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(-1 ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z = true;
        boolean A1T = AnonymousClass7TF.A1T(numberOfLeadingZeros, 64);
        boolean A1T2 = C51970G9q.A1T((j > 0 ? 1 : (j == 0 ? 0 : -1)));
        if (j2 != Long.MIN_VALUE) {
            z = false;
        }
        if (A1T || (A1T2 & z)) {
            return j3;
        }
        long j4 = j * j2;
        if (j == 0 || j4 / j == j2) {
            return j4;
        }
        return j3;
    }
}
