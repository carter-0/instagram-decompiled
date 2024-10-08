package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fgk  reason: case insensitive filesystem */
public final class C50685Fgk implements G6E {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C331157Pu A02;
    public final /* synthetic */ User A03;

    public C50685Fgk(FragmentActivity fragmentActivity, UserSession userSession, C331157Pu r3, User user) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = user;
    }

    public final void E16() {
        C331157Pu r6 = this.A02;
        UserSession userSession = this.A01;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0a = AnonymousClass7TE.A0u();
        DbZ.A0z(this.A00, A0W, 2131962579);
        C46447Df9.A03();
        String id = this.A03.getId();
        Bundle A09 = DbY.A09(userSession);
        A09.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", id);
        A09.putString("ProfileLiveNotificationsSettingsFragment.CLICK_POINT", "user_profile_header");
        C47419E1n e1n = new C47419E1n();
        e1n.setArguments(A09);
        r6.A0F(e1n, A0W);
    }
}
