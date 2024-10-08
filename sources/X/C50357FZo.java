package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.FZo  reason: case insensitive filesystem */
public final class C50357FZo implements JQE {
    public final int Az3() {
        return R.drawable.instagram_insights_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "creator_tools_main_page", "insights_row");
        F5N.A01(DbS.A0M(fragmentActivity, userSession), ValuePropsFlow.INSIGHTS);
    }

    public final int getTitleRes() {
        return 2131964354;
    }
}
