package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2p  reason: case insensitive filesystem */
public final class C72350P2p implements C74394PuA {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final N4P A05;
    public final 1a8 A06;

    public C72350P2p(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r4, 1a8 r5, UserSession userSession, Capabilities capabilities, N4P n4p) {
        DbW.A1O(userSession, 3, r5);
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        this.A03 = userSession;
        this.A05 = n4p;
        this.A04 = capabilities;
        this.A06 = r5;
        this.A02 = r4;
    }

    public final List getItems() {
        FragmentActivity fragmentActivity = this.A01;
        C68303N9q n9q = (C68303N9q) AnonymousClass7TE.A13(JTO.A15(this.A05.A0c));
        0qQ.A0B(n9q, 0);
        int i = 2131953885;
        if (n9q.A00.CXO()) {
            i = 2131975843;
        }
        C50989Fmc fmc = new C50989Fmc(fragmentActivity, new C71395Oju(this, 22), i, 2Yu.A03(fragmentActivity));
        fmc.A0B = true;
        fmc.A03 = R.drawable.instagram_block_pano_outline_24;
        return AnonymousClass7TE.A1I(fmc);
    }

    public final boolean isEnabled() {
        return C69950Nuq.A00(this.A04, this.A05);
    }
}
