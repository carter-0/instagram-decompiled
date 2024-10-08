package X;

import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6p9  reason: invalid class name and case insensitive filesystem */
public final class C318556p9 extends C243843aC {
    public final /* synthetic */ FadeInFollowButton A00;

    public C318556p9(FadeInFollowButton fadeInFollowButton) {
        this.A00 = fadeInFollowButton;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        C323356xM r0 = this.A00.A06;
        if (r0 != null) {
            r0.D2B(user);
        }
    }

    public final void DGO(User user) {
        C243853aD r0 = this.A00.A07;
        if (r0 != null) {
            r0.DGO(user);
        }
    }

    public final void DGP(User user) {
        C243853aD r0 = this.A00.A07;
        if (r0 != null) {
            r0.DGP(user);
        }
    }
}
