package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class PAG implements C74404PuK {
    public final FragmentActivity A00;
    public final C376519Ih A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C333517Zg A04;

    public final boolean isEnabled() {
        return C48848ElA.A00(this.A01, this.A03, this.A04);
    }

    public PAG(FragmentActivity fragmentActivity, C376519Ih r2, AnonymousClass0iw r3, UserSession userSession, C333517Zg r5) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final N4H BWk() {
        return new N4H((View.OnClickListener) new C71397Ojw(this, 41), (int) R.drawable.instagram_link_pano_outline_24, 2131963172);
    }
}
