package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OLi  reason: case insensitive filesystem */
public final class C70788OLi {
    public User A00;
    public Boolean A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final OZR A05;
    public final C331537Rj A06;

    public final void A00(User user) {
        OZR ozr = this.A05;
        if (ozr.A02) {
            0KC.A0E("DirectVideoCallLauncherImpl", "Attempt to create thread and launch video call while launching another.");
            return;
        }
        this.A00 = user;
        this.A01 = false;
        ozr.A02(AnonymousClass7TE.A1I(user.getId()));
    }

    public C70788OLi(Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C331537Rj r6) {
        this.A04 = userSession;
        this.A02 = fragment;
        this.A06 = r6;
        this.A03 = r4;
        this.A05 = new OZR(fragment, userSession, new PFF(this));
    }
}
