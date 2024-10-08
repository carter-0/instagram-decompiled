package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;

public final class R92 extends C8804RAf {
    public final /* synthetic */ HTTPRequestError A00;
    public final /* synthetic */ C12199Soo A01;

    public R92(HTTPRequestError hTTPRequestError, C12199Soo soo) {
        this.A01 = soo;
        this.A00 = hTTPRequestError;
    }

    public final void run() {
        C12199Soo soo;
        S28 s28;
        try {
            HTTPRequestError hTTPRequestError = this.A00;
            if (hTTPRequestError.mErrCode == HTTPRequestError.ProxygenError.Canceled) {
                soo = this.A01;
                s28 = soo.A09;
                s28.A00 = "cancelled";
            } else {
                soo = this.A01;
                s28 = soo.A09;
                s28.A00 = "error";
            }
            RequestStatsObserver requestStatsObserver = soo.A07;
            RequestStats requestStats = requestStatsObserver.getRequestStats();
            if (requestStats != null) {
                s28.A00(requestStats);
                C12199Soo.A01(soo, requestStats.getFlowTimeData());
            }
            soo.A01 = new C8838RCa(hTTPRequestError);
            1QS r3 = soo.A08;
            C11410SSi.A03(hTTPRequestError, requestStatsObserver, r3);
            soo.A0A.A01(r3, TraceFieldType.RspBodySize, soo.A00);
            soo.A02.DCl(soo.A01);
        } catch (IllegalStateException e) {
            0wb.A07("LigerAsyncInterface_error", e);
        }
    }

    public final String toString() {
        return Pxf.A0l("LigerAsyncResponseHandler.onError: ", this.A01.A08.A09);
    }
}
