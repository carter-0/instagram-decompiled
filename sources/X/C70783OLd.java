package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.OLd  reason: case insensitive filesystem */
public final class C70783OLd {
    public final /* synthetic */ OWR A00;
    public final /* synthetic */ C70639OEl A01;
    public final /* synthetic */ OVI A02;
    public final /* synthetic */ OB7 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C70783OLd(OWR owr, C70639OEl oEl, OVI ovi, OB7 ob7, String str, String str2, byte[] bArr) {
        this.A01 = oEl;
        this.A00 = owr;
        this.A05 = str;
        this.A03 = ob7;
        this.A06 = bArr;
        this.A02 = ovi;
        this.A04 = str2;
    }

    public final void A00(Throwable th) {
        Integer num;
        OWR owr = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = owr.A01;
        int i = owr.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "begin_login_network_end");
        C66583MXo.A1D(lightweightQuickPerformanceLogger, "begin_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C69542Nnm) && (num = ((C69542Nnm) th).A00) != null) {
            owr.A00(num.intValue());
            OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A04, th));
        }
        OVI.A00(this.A01, this.A02, new C69545Nnp(AnonymousClass05K.A1F, th));
    }
}
