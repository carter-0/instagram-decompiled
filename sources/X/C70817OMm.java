package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OMm  reason: case insensitive filesystem */
public final class C70817OMm {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C69028NdD A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, C73905Plg.A00(this, 34));

    public final void A01(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        C70288O0s.A00(this.A00, this.A02, AnonymousClass05K.A00, str, str2, C73905Plg.A00(this, 39), new C59100J6i(this, 33));
    }

    public final void A00() {
        C71054OaW.A00(this.A00, C73905Plg.A00(this, 37), true);
    }

    public C70817OMm(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C69028NdD ndD) {
        C51972G9s.A1C(userSession, ndD);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r4;
        this.A03 = ndD;
    }
}
