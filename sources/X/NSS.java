package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Map;

public final class NSS extends 0ng {
    public final /* synthetic */ 1bC A00;
    public final /* synthetic */ OKU A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSS(1bC r3, OKU oku, Map map, Map map2, int i) {
        super(1213736202, i, false, false);
        this.A00 = r3;
        this.A03 = map;
        this.A02 = map2;
        this.A01 = oku;
    }

    public final void run() {
        1bC r3 = this.A00;
        Map map = this.A03;
        Map map2 = this.A02;
        OKU oku = this.A01;
        boolean A0G = 1bC.A0G(r3, oku, map, map2);
        UserSession userSession = r3.A01;
        2I1 A002 = 2Hz.A00(userSession);
        IGFOAMessagingReadyLogger A003 = 2Hi.A00(userSession);
        QuickPerformanceLogger quickPerformanceLogger = oku.A01;
        int i = oku.A00;
        if (A0G) {
            quickPerformanceLogger.markerEnd(20122304, i, 167);
            A002.A01();
            if (A003 != null) {
                A003.onOfflineMessageProcessed();
                return;
            }
            return;
        }
        quickPerformanceLogger.markerEnd(20122304, i, 168);
        A002.A02();
        if (A003 != null) {
            A003.onOfflineMessageProcessedFailed();
        }
    }
}
