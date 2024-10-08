package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M1x  reason: case insensitive filesystem */
public final class C65856M1x implements Runnable {
    public final /* synthetic */ C15299Ua6 A00;

    public C65856M1x(C15299Ua6 ua6) {
        this.A00 = ua6;
    }

    public final void run() {
        C322576w3.A00().A02();
        C15299Ua6 ua6 = this.A00;
        UserSession A0J = JTS.A0J(ua6.A0F);
        K4h k4h = new K4h();
        DbZ.A1B(k4h, "IgSessionManager.SESSION_TOKEN_KEY", A0J.A05);
        0s1 r2 = new 0s1(ua6.getParentFragmentManager());
        DbT.A1I(ua6);
        r2.A0D(k4h, k4h.mTag, JTR.A0U(ua6.requireView()).getId());
        r2.A0I((String) null);
        r2.A00();
    }
}
