package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.Pbw  reason: case insensitive filesystem */
public final class C73399Pbw implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C331527Ri A02;
    public final /* synthetic */ RtcCallFunnelSessionId A03;
    public final /* synthetic */ C331537Rj A04;
    public final /* synthetic */ boolean A05;

    public C73399Pbw(AnonymousClass4DH r1, UserSession userSession, C331527Ri r3, RtcCallFunnelSessionId rtcCallFunnelSessionId, C331537Rj r5, boolean z) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A03 = rtcCallFunnelSessionId;
        this.A02 = r3;
        this.A05 = z;
        this.A04 = r5;
    }

    public final void run() {
        AnonymousClass4DH r3 = this.A00;
        Context requireContext = r3.requireContext();
        UserSession userSession = this.A01;
        if (!new 1Cn(C66653MaM.A00(requireContext, userSession).A00).A07(false)) {
            C358248ab A0Y = DbS.A0Y(requireContext);
            A0Y.A09(2131976556);
            A0Y.A08(2131976555);
            Dba.A1L(A0Y);
            C71096OcW.A03(userSession, this.A03, AnonymousClass05K.A00);
            return;
        }
        Context requireContext2 = r3.requireContext();
        C331527Ri r5 = this.A02;
        boolean z = this.A05;
        C71096OcW.A01(requireContext2, (C69465Nm9) null, r3, userSession, r5, this.A03, this.A04, (RtcStartCoWatchPlaybackArguments) null, z);
    }
}
