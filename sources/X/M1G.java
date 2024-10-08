package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class M1G implements G7U {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C363008it A03;

    public final void onAuthorizeFail() {
    }

    public M1G(FragmentActivity fragmentActivity, AnonymousClass4DH r2, UserSession userSession, C363008it r4) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass4DH r6 = this.A01;
        C363008it r3 = this.A03;
        if (!182.A06(0Tu.A05, userSession, 36326618641610627L)) {
            C63427Kwn.A00(fragmentActivity, r6.getContext(), r6, AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS_POST_ACCOUNT_LINK, userSession, new C65641LxI(r3, 6));
        }
    }
}
