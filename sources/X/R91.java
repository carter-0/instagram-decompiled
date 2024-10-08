package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;

public final class R91 extends C8804RAf {
    public final /* synthetic */ C12199Soo A00;

    public R91(C12199Soo soo) {
        this.A00 = soo;
    }

    public final void run() {
        try {
            C12199Soo soo = this.A00;
            S28 s28 = soo.A09;
            s28.A00 = "done";
            RequestStatsObserver requestStatsObserver = soo.A07;
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats != null) {
                C12199Soo.A01(soo, requestStats.getFlowTimeData());
                s28.A00(requestStats);
            }
            1QS r3 = soo.A08;
            C11410SSi.A03((HTTPRequestError) null, requestStatsObserver, r3);
            AnonymousClass1C6 r1 = soo.A04;
            1C5 r0 = soo.A05;
            if (!(r0 == null || r1 == null)) {
                r0.A00(r1);
            }
            soo.A0A.A01(r3, TraceFieldType.RspBodySize, soo.A00);
            soo.A02.onEOM();
        } catch (IllegalStateException e) {
            0wb.A07("LigerAsyncInterface_eom", e);
        }
    }

    public final String toString() {
        return Pxf.A0l("LigerAsyncResponseHandler.onEOM: ", this.A00.A08.A09);
    }
}
