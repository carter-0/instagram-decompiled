package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.4yx  reason: invalid class name and case insensitive filesystem */
public final class C279624yx extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C279624yx(2Lk r7) {
        super("maybeWarmHeliumWebView", 1539081353, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r6 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r6.A04;
        02m r5 = 02m.A0p;
        0qQ.A07(r5);
        try {
            r5.markerStart(47654996);
            r5.markerPoint(47654996, "warm_provider_start");
            RUF.A00();
            r5.markerPoint(47654996, "warm_provider_end");
            r5.markerEnd(47654996, 2);
        } catch (Exception e) {
            r5.markerPoint(47654996, "error_while_warming");
            0KC.A0F("HeliumWebViewWarmer", "Error preloading Webview", e);
            r5.markerEnd(47654996, 3);
        }
        if (182.A06(0Tu.A05, userSession, 36330982327993192L)) {
            C249103j8.A00(r6.A01);
        }
    }
}
