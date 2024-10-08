package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M1y  reason: case insensitive filesystem */
public final class C65857M1y implements Runnable {
    public final /* synthetic */ C61403K5y A00;

    public C65857M1y(C61403K5y k5y) {
        this.A00 = k5y;
    }

    public final void run() {
        C322576w3.A00().A02();
        C61403K5y k5y = this.A00;
        UserSession A0J = JTS.A0J(k5y.A0A);
        K4h k4h = new K4h();
        DbZ.A1B(k4h, "IgSessionManager.SESSION_TOKEN_KEY", A0J.A05);
        0s1 r2 = new 0s1(k5y.getParentFragmentManager());
        DbT.A1I(k5y);
        r2.A0D(k4h, k4h.mTag, JTR.A0U(k5y.requireView()).getId());
        r2.A0I((String) null);
        r2.A00();
    }
}
