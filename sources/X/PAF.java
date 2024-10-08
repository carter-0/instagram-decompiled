package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class PAF implements C74404PuK {
    public final UserSession A00;
    public final C333517Zg A01;
    public final C332907Wx A02;

    public final boolean isEnabled() {
        return !this.A01.C6l().CV8();
    }

    public PAF(UserSession userSession, C333517Zg r2, C332907Wx r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final N4H BWk() {
        return new N4H((View.OnClickListener) new C71397Ojw(this, 44), (int) R.drawable.instagram_users_pano_outline_24, 2131968704);
    }
}
