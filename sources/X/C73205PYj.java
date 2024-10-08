package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;

/* renamed from: X.PYj  reason: case insensitive filesystem */
public final class C73205PYj implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ RtcCallFunnelSessionId A01;

    public C73205PYj(UserSession userSession, RtcCallFunnelSessionId rtcCallFunnelSessionId) {
        this.A00 = userSession;
        this.A01 = rtcCallFunnelSessionId;
    }

    public final void run() {
        C71096OcW.A03(this.A00, this.A01, AnonymousClass05K.A0Y);
    }
}
