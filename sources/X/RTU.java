package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Map;

public abstract class RTU {
    public static final Object A00(C307896Rx r19, AnonymousClass6Tm r20) {
        Runnable tff;
        C307896Rx r6 = r19;
        Object A01 = r20.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type android.os.Handler");
        Handler handler = (Handler) A01;
        C277014uI A0N = DbW.A0N(r20);
        if (C245983dn.A03() || !0qQ.A0K(handler.getLooper(), Looper.getMainLooper())) {
            if (C245983dn.A03() && !0qQ.A0K(handler.getLooper(), Looper.getMainLooper())) {
                C307786Rm r9 = r6.A03;
                if (r9 == null) {
                    r6 = null;
                } else {
                    C229392nJ r5 = r9.A02;
                    List list = r6.A0D;
                    C307446Qd A02 = C307476Qg.A02(r9);
                    C245983dn.A02("Tree resources can only be read from the UI Thread");
                    C307456Qe A07 = A02.A04.A07((Map) null, A02.A08);
                    C276744tp A05 = C307476Qg.A05(r9);
                    r6 = new C307896Rx((C276634te) null, (C307786Rm) null, r9, A07, (AnonymousClass6SD) null, r5.AgE().AgJ(), A0N, A05, AnonymousClass05K.A01, C307476Qg.A07(r9), (String) null, list, (Map) null, (Map) null);
                }
            }
            tff = new TFF(r6, A0N);
        } else {
            tff = new TFE(r6, A0N);
        }
        handler.post(tff);
        return null;
    }
}
