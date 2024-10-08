package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FYi  reason: case insensitive filesystem */
public final class C50328FYi implements AnonymousClass0lh {
    public Fragment A00;
    public FragmentActivity A01;
    public EEN A02;
    public final UserSession A03;

    public final void onSessionWillEnd() {
        UserSession userSession = this.A03;
        0qQ.A0B(userSession, 0);
        W3U w3u = W3U.A00;
        0xY AR4 = W3U.A02(userSession, w3u).AR4();
        AR4.E5Z(AnonymousClass000.A00(1871), 0);
        AR4.apply();
        0xY AR42 = W3U.A02(userSession, w3u).AR4();
        AR42.E5c(AnonymousClass000.A00(4081), 0);
        AR42.apply();
    }

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity) {
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        this.A02 = C249713kF.A00.A0W(this.A03);
        AnonymousClass4DH r1 = this.A00;
        if (r1 instanceof AnonymousClass4DH) {
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
            r1.registerLifecycleListener(this.A02);
        }
    }

    public C50328FYi(UserSession userSession) {
        this.A03 = userSession;
    }
}
