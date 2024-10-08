package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G4l  reason: case insensitive filesystem */
public final class C51853G4l extends C51855G4n implements 0lm {
    public static final 0xG A03 = DbS.A0O("fx_unified_launcher");
    public final 02m A00;
    public final UserSession A01;
    public final C50342FYz A02;

    public C51853G4l(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = (C50342FYz) userSession.A01(C50342FYz.class, new C73662Phb(userSession, 19));
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A00 = r0;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A01.A03(C51853G4l.class);
    }

    public final void A03() {
        super.A03();
        this.A00.markerPoint(444800256, "initial_async_controller_request_success");
    }

    public final void A04(String str) {
        super.A04(str);
        02m r2 = this.A00;
        r2.markerPoint(444800256, "initial_async_controller_request_failure");
        r2.markerEnd(444800256, 87);
    }
}
