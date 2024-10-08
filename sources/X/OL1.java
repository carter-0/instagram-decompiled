package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public final class OL1 {
    public final /* synthetic */ OWR A00;
    public final /* synthetic */ C70639OEl A01;
    public final /* synthetic */ OVI A02;
    public final /* synthetic */ ODH A03;

    public OL1(OWR owr, C70639OEl oEl, OVI ovi, ODH odh) {
        this.A01 = oEl;
        this.A00 = owr;
        this.A02 = ovi;
        this.A03 = odh;
    }

    public final void A00(Throwable th) {
        Integer num;
        OWR owr = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = owr.A01;
        int i = owr.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "finish_login_network_end");
        C66583MXo.A1D(lightweightQuickPerformanceLogger, "finish_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C69542Nnm) && (num = ((C69542Nnm) th).A00) != null) {
            owr.A00(num.intValue());
            OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A04, th));
        }
        OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A1F, th));
    }
}
