package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.DeX  reason: case insensitive filesystem */
public final class C46410DeX {
    public UserSession A00;
    public Dc2 A01;
    public C46465DfT A02;
    public UserDetailFragment A03;

    public final void A01() {
        Dc2 dc2 = this.A01;
        if (dc2 != null) {
            DbX.A1R(dc2);
            this.A01 = null;
        }
    }

    public static void A00(FragmentActivity fragmentActivity, UserSession userSession, User user, C46443Df5 df5) {
        1YE A012 = C46339Dch.A01();
        user.getId();
        FollowListData A002 = C46451DfE.A00(df5, user.getId(), (String) null, false);
        0qQ.A0B(userSession, 0);
        Bundle AM4 = A012.AM4(userSession, A002, false);
        AM4.putBoolean("FollowListFragment.ShowSearchBar", false);
        AM4.putBoolean("FollowListFragment.ShouldBypassUnfollowConfirmationDialog", true);
        C46430Der der = new C46430Der();
        der.setArguments(AM4);
        Dbb.A12(der, fragmentActivity, userSession);
    }
}
