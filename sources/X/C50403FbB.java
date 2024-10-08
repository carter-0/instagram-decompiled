package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FbB  reason: case insensitive filesystem */
public final class C50403FbB implements C74404PuK {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333517Zg A03;

    public final N4H BWk() {
        User user = (User) 00k.A0J(this.A03.C6l().C6Q().A0b);
        String str = null;
        if (user != null) {
            str = user.A03.AaR();
        }
        UserSession userSession = this.A02;
        return new N4H((View.OnClickListener) new FOD(this, new LTH(userSession), user, AnonymousClass7TM.A00(userSession), str, 2), (int) R.drawable.instagram_user_circle_pano_outline_24, 2131968702);
    }

    public final boolean isEnabled() {
        return AnonymousClass7TF.A1S(this.A03.C6l().C6Q().A08, 1014);
    }

    public C50403FbB(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C333517Zg r4) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }
}
