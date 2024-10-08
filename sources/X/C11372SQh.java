package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SQh  reason: case insensitive filesystem */
public final class C11372SQh {
    public static final long A01 = JTR.A0N(TimeUnit.DAYS);
    public static volatile C11372SQh A02;
    public C9132RQg A00;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.SQh] */
    public static C11372SQh A00() {
        if (A02 == null) {
            synchronized (C11372SQh.class) {
                if (A02 == null) {
                    A02 = new Object();
                }
            }
        }
        return A02;
    }

    public static void A01(C11372SQh sQh) {
        C9132RQg rQg = sQh.A00;
        if (rQg != null) {
            0xY AR4 = 0xn.A01("RNWhiteListedRouteStore_Prefs").AR4();
            AR4.E5c("RNWhiteListedRouteStore_TS", rQg.A01);
            AR4.E5Z("RNWhiteListedRouteStore_RC", rQg.A00);
            Set set = rQg.A02;
            if (set == null) {
                set = AnonymousClass7TE.A1F();
                rQg.A02 = set;
            }
            AR4.E5h("RNWhiteListedRouteStore_RL", Collections.unmodifiableSet(set));
            AR4.apply();
        }
    }
}
