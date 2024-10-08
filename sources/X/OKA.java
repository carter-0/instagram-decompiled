package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public final class OKA {
    public final /* synthetic */ C71000OVw A00;
    public final /* synthetic */ OV9 A01;

    public final void A00(Throwable th) {
        0qQ.A0B(th, 0);
        C71000OVw oVw = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = oVw.A01;
        int i = oVw.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "finish_register_network_end");
        C66583MXo.A1D(lightweightQuickPerformanceLogger, "finish_register_network_call_error", message, 1021652080, i);
        OV9.A00(this.A01, AnonymousClass05K.A0Y, (Integer) null, th);
    }

    public OKA(C71000OVw oVw, OV9 ov9) {
        this.A00 = oVw;
        this.A01 = ov9;
    }
}
