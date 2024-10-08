package X;

import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.S4w  reason: case insensitive filesystem */
public final class C11002S4w {
    public final /* synthetic */ SmartCaptureLogger A00;
    public final /* synthetic */ C13584TdA A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C307896Rx A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ C277014uI A05;
    public final /* synthetic */ String A06;

    public C11002S4w(SmartCaptureLogger smartCaptureLogger, C13584TdA tdA, C307786Rm r3, C307896Rx r4, C277014uI r5, C277014uI r6, String str) {
        this.A00 = smartCaptureLogger;
        this.A06 = str;
        this.A02 = r3;
        this.A05 = r5;
        this.A03 = r4;
        this.A01 = tdA;
        this.A04 = r6;
    }

    public final void A00() {
        LinkedHashMap A0y;
        SmartCaptureLogger smartCaptureLogger = this.A00;
        String str = this.A06;
        C7908Qce qce = C7908Qce.A01;
        if (str == null) {
            A0y = null;
        } else {
            A0y = C66582MXn.A0y("upload_infra", str);
        }
        smartCaptureLogger.logEvent("upload_failed", A0y);
        C277014uI r2 = this.A04;
        C299275ur.A00(this.A03, new AnonymousClass6Tm(AnonymousClass7TE.A1I(this.A02)), r2);
    }

    public final void A01(Map map) {
        LinkedHashMap A0y;
        SmartCaptureLogger smartCaptureLogger = this.A00;
        String str = this.A06;
        C7908Qce qce = C7908Qce.A01;
        if (str == null) {
            A0y = null;
        } else {
            A0y = C66582MXn.A0y("upload_infra", str);
        }
        smartCaptureLogger.logEvent("upload_success", A0y);
        C299275ur.A00(this.A03, new AnonymousClass6Tm(0sr.A1P(new Object[]{this.A02, map})), this.A05);
        this.A01.D1q();
    }
}
