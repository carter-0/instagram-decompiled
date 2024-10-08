package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
public final class C239423Gk implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Av A02;
    public final /* synthetic */ C239413Gj A03;

    public C239423Gk(FragmentActivity fragmentActivity, UserSession userSession, 1Av r3, C239413Gj r4) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void run() {
        UserSession userSession = this.A01;
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("live/get_good_time_for_live/");
        r3.A0O((15p) null, C293445kk.class, C293455kl.class, true);
        r3.A0R = true;
        1OC A0M = r3.A0M();
        C239413Gj r32 = this.A03;
        1Av r2 = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        A0M.A00 = new C293465km(fragmentActivity, userSession, r2, r32);
        1ES.A00(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), A0M);
    }
}
