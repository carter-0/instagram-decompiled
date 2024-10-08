package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public final class OV9 {
    public final /* synthetic */ C71000OVw A00;
    public final /* synthetic */ C71087ObS A01;

    public OV9(C71000OVw oVw, C71087ObS obS) {
        this.A00 = oVw;
        this.A01 = obS;
    }

    public static void A00(OV9 ov9, Integer num, Integer num2, Throwable th) {
        ov9.A01(new C69548Nns(num, num2, th));
    }

    public final void A01(C69548Nns nns) {
        C69363Nk3 nk3;
        C71000OVw oVw = this.A00;
        String message = nns.getMessage();
        if (message == null) {
            message = "Unknown Vesta registration failure";
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = oVw.A01;
        int i = oVw.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i, "vesta_registration_failed");
        C66583MXo.A1C(lightweightQuickPerformanceLogger, "vesta_registration_error", message, 1021652080, i);
        C71087ObS obS = this.A01;
        Integer num = nns.A00;
        if (num == AnonymousClass05K.A0u) {
            Integer num2 = nns.A01;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 2) {
                    nk3 = C69363Nk3.A0B;
                } else if (intValue == 3) {
                    nk3 = C69363Nk3.A08;
                } else if (intValue == 10) {
                    nk3 = C69363Nk3.A05;
                } else if (intValue == 11) {
                    nk3 = C69363Nk3.A09;
                }
            }
            nk3 = C69363Nk3.A07;
        } else {
            if (num == AnonymousClass05K.A0Y) {
                nk3 = C69363Nk3.A0E;
            }
            nk3 = C69363Nk3.A07;
        }
        obS.A05(new N0Q(nk3));
    }
}
