package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;

public final class PAH implements C74404PuK {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C47167Dri A03;
    public final Capabilities A04;

    public final boolean isEnabled() {
        UserSession userSession = this.A02;
        Capabilities capabilities = this.A04;
        C47167Dri dri = this.A03;
        return C327827Ci.A02(userSession, capabilities, dri.A06, dri.A01, dri.A0F, dri.A0O);
    }

    public PAH(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, Capabilities capabilities, C333517Zg r7) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = capabilities;
        this.A01 = r4;
        this.A03 = new C71123OdH((C376519Ih) null, userSession, r7).A03();
    }

    public final N4H BWk() {
        String str;
        FragmentActivity fragmentActivity = this.A00;
        ThemeViewModelDelegate themeViewModelDelegate = this.A03.A03;
        Drawable A002 = C327827Ci.A00(fragmentActivity, themeViewModelDelegate);
        0qQ.A0B(themeViewModelDelegate, 1);
        if (AnonymousClass3HA.A00(fragmentActivity)) {
            str = themeViewModelDelegate.A06;
        } else {
            str = themeViewModelDelegate.A08;
        }
        if (str == null || !C253833rU.A03(str)) {
            str = null;
        }
        return new N4H(A002, new C71397Ojw(this, 45), str, -1, 2131968707, 2);
    }
}
