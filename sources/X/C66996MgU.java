package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.MgU  reason: case insensitive filesystem */
public abstract class C66996MgU {
    public static Object A01(C74233PrM prM) {
        if (prM instanceof C72176Oxl) {
            return ((C72176Oxl) prM).A00;
        }
        throw new IllegalArgumentException();
    }

    public static Object A02(C74233PrM prM) {
        if (prM instanceof C66990MgO) {
            return ((C66990MgO) prM).A00;
        }
        throw new IllegalArgumentException();
    }

    public static long A00(C74233PrM prM) {
        return ((MsysThreadId) A02(prM)).A00;
    }
}
