package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.FbE  reason: case insensitive filesystem */
public final class C50406FbE implements C74404PuK {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C47167Dri A03;
    public final Capabilities A04;
    public final boolean A05;

    public final boolean isEnabled() {
        Capabilities capabilities = this.A04;
        C47167Dri dri = this.A03;
        boolean z = this.A05;
        if (dri.A0M || !capabilities.A00(C376179Gx.THREAD_DETAILS_ADD_MEMBER_TO_GROUP_CHAT) || !dri.A0O || z) {
            return false;
        }
        return true;
    }

    public C50406FbE(FragmentActivity fragmentActivity, C376519Ih r3, AnonymousClass0iw r4, UserSession userSession, Capabilities capabilities, C333517Zg r7, boolean z) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = capabilities;
        this.A05 = z;
        this.A01 = r4;
        this.A03 = new C71123OdH(r3, userSession, r7).A03();
    }

    public final N4H BWk() {
        int i = 2131968699;
        if (182.A06(0Tu.A05, this.A02, 36324578531750053L)) {
            i = 2131968698;
        }
        return new N4H((View.OnClickListener) FP8.A00(this, 42), (int) R.drawable.instagram_user_follow_pano_outline_24, i);
    }
}
