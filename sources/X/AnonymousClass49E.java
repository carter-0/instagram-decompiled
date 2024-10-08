package X;

/* renamed from: X.49E  reason: invalid class name */
public abstract class AnonymousClass49E {
    public static final long A00(AnonymousClass30J r9, long j, long j2) {
        long j3;
        long j4 = j - j2;
        if (((j4 ^ j) & ((j4 ^ j2) ^ -1)) >= 0) {
            return AnonymousClass30K.A04(r9, j4);
        }
        AnonymousClass30J r6 = AnonymousClass30J.MILLISECONDS;
        if (r9.compareTo(r6) < 0) {
            0qQ.A0B(r6, 1);
            long convert = r9.A00.convert(1, r6.A00);
            return AnonymousClass30M.A05(AnonymousClass30K.A04(r6, (j / convert) - (j2 / convert)), AnonymousClass30K.A04(r9, (j % convert) - (j2 % convert)));
        }
        if (j4 < 0) {
            j3 = AnonymousClass30M.A02;
        } else {
            j3 = AnonymousClass30M.A01;
        }
        return ((-(j3 >> 1)) << 1) + ((long) (((int) j3) & 1));
    }
}
