package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public final class OLW {
    public final /* synthetic */ OWR A00;
    public final /* synthetic */ C70639OEl A01;
    public final /* synthetic */ OVI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public OLW(OWR owr, C70639OEl oEl, OVI ovi, String str, String str2, String str3) {
        this.A01 = oEl;
        this.A00 = owr;
        this.A02 = ovi;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public final void A00(Throwable th) {
        Integer num;
        OWR owr = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = owr.A01;
        int i = owr.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "init_login_network_end");
        C66583MXo.A1D(lightweightQuickPerformanceLogger, "init_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C69542Nnm) && (num = ((C69542Nnm) th).A00) != null) {
            owr.A00(num.intValue());
            OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A04, th));
        }
        OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A1F, th));
    }
}
