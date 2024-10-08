package X;

import java.util.Comparator;

/* renamed from: X.TLo  reason: case insensitive filesystem */
public final class C13105TLo implements Comparator {
    public static int A00(C10728Rx6 rx6) {
        QC2 qc2 = rx6.A01;
        if (qc2 == null) {
            String str = rx6.A04;
            switch (str.hashCode()) {
                case -1459274090:
                    if (!str.equals("BLOKS_PAYMENT_USAGE")) {
                        return 3;
                    }
                    break;
                case 161743991:
                    if (!str.equals("BLOKS_HYBRID_PAYMENT_USAGE")) {
                        return 3;
                    }
                    break;
                case 2021963056:
                    if (!str.equals("BLOKS_CONTACT_USAGE")) {
                        return 3;
                    }
                    break;
            }
        } else if (!qc2.A0G() || (!(qc2 instanceof QKG) && !(qc2 instanceof QKJ))) {
            if (!qc2.A0G()) {
                if ((qc2 instanceof QKG) || (qc2 instanceof QKJ)) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C10728Rx6 rx6 = (C10728Rx6) obj;
        C10728Rx6 rx62 = (C10728Rx6) obj2;
        int A00 = A00(rx6) - A00(rx62);
        if (A00 != 0) {
            return A00;
        }
        long j = rx6.A00;
        long j2 = rx62.A00;
        if (j < j2) {
            return -1;
        }
        return C51970G9q.A1U((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
    }
}
