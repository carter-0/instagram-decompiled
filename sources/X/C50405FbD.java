package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.FbD  reason: case insensitive filesystem */
public final class C50405FbD implements C74404PuK {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333517Zg A03;
    public final Capabilities A04;

    public final boolean isEnabled() {
        return C70034NwC.A00(this.A02, this.A03);
    }

    public C50405FbD(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, Capabilities capabilities, C333517Zg r5) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r5;
        this.A04 = capabilities;
        this.A01 = r2;
    }

    public final N4H BWk() {
        return new N4H((View.OnClickListener) FP8.A00(this, 43), (int) R.drawable.instagram_user_follow_pano_outline_24, 2131968703);
    }
}
