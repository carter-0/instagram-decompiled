package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.FZl  reason: case insensitive filesystem */
public final class C50354FZl implements JQE {
    public final int Az3() {
        return R.drawable.instagram_tag_down_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "monetization", "creator_marketplace_row");
        F5N.A01(DbS.A0M(fragmentActivity, userSession), ValuePropsFlow.CREATOR_MARKETPLACE);
    }

    public final int getTitleRes() {
        return 2131966699;
    }
}
