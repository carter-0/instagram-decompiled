package X;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public final class QE1 extends S04 {
    public long A00 = -9223372036854775807L;
    public long[] A01 = new long[0];
    public long[] A02 = new long[0];

    public QE1() {
        super(new C11715SfC());
    }

    public static Object A00(C11389SRd sRd, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(sRd.A0B()));
        }
        if (i == 1) {
            boolean z = true;
            if (sRd.A05() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return A01(sRd);
        } else {
            if (i == 3) {
                HashMap A1E = AnonymousClass7TE.A1E();
                while (true) {
                    String A012 = A01(sRd);
                    int A05 = sRd.A05();
                    if (A05 == 9) {
                        return A1E;
                    }
                    Object A002 = A00(sRd, A05);
                    if (A002 != null) {
                        A1E.put(A012, A002);
                    }
                }
            } else if (i == 8) {
                return A02(sRd);
            } else {
                if (i == 10) {
                    int A07 = sRd.A07();
                    ArrayList A0v = DbS.A0v(A07);
                    for (int i2 = 0; i2 < A07; i2++) {
                        Object A003 = A00(sRd, sRd.A05());
                        if (A003 != null) {
                            A0v.add(A003);
                        }
                    }
                    return A0v;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.longBitsToDouble(sRd.A0B()));
                    sRd.A0P(2);
                    return date;
                }
            }
        }
    }

    public static String A01(C11389SRd sRd) {
        int A08 = sRd.A08();
        int i = sRd.A01;
        sRd.A0P(A08);
        return new String(sRd.A02, i, A08);
    }

    public static HashMap A02(C11389SRd sRd) {
        int A07 = sRd.A07();
        HashMap hashMap = new HashMap(A07);
        for (int i = 0; i < A07; i++) {
            String A012 = A01(sRd);
            Object A002 = A00(sRd, sRd.A05());
            if (A002 != null) {
                hashMap.put(A012, A002);
            }
        }
        return hashMap;
    }
}
