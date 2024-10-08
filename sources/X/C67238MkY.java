package X;

/* renamed from: X.MkY  reason: case insensitive filesystem */
public abstract class C67238MkY {
    public static final 2EN A01(C67256Mkq mkq) {
        int A02 = DbU.A02(mkq, 0);
        if (A02 == 1) {
            return 2EN.A06;
        }
        if (A02 == 3) {
            return 2EN.A07;
        }
        if (A02 == 0 || A02 != 4) {
            return 2EN.A05;
        }
        return 2EN.A04;
    }

    public static final C67256Mkq A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return C67256Mkq.PENDING;
            }
            if (intValue == 2) {
                return C67256Mkq.OTHER;
            }
            if (intValue == 3) {
                return C67256Mkq.SPAM;
            }
            if (intValue != 0 && intValue == 16) {
                return C67256Mkq.BC_PARTNERSHIP;
            }
        }
        return C67256Mkq.INBOX;
    }

    public static final int A00(C67256Mkq mkq) {
        int ordinal = mkq.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        return 0;
    }
}
