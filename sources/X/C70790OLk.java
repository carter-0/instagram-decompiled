package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.OLk  reason: case insensitive filesystem */
public final class C70790OLk {
    public final /* synthetic */ C71000OVw A00;
    public final /* synthetic */ O5T A01;
    public final /* synthetic */ OV9 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void A00(Throwable th) {
        0qQ.A0B(th, 0);
        C71000OVw oVw = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = oVw.A01;
        int i = oVw.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "init_register_network_end");
        C66583MXo.A1D(lightweightQuickPerformanceLogger, "init_register_network_call_error", message, 1021652080, i);
        OV9.A00(this.A02, AnonymousClass05K.A0Y, (Integer) null, th);
    }

    public C70790OLk(C71000OVw oVw, O5T o5t, OV9 ov9, Integer num, String str, String str2, String str3, String str4) {
        this.A00 = oVw;
        this.A02 = ov9;
        this.A01 = o5t;
        this.A03 = num;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }
}
