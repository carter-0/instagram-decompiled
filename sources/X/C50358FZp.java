package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.FZp  reason: case insensitive filesystem */
public final class C50358FZp implements JQE {
    public final int Az3() {
        return R.drawable.instagram_guides_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "creator_tools_main_page", "inspiration_row");
        F5N.A01(DbS.A0M(fragmentActivity, userSession), ValuePropsFlow.INSPIRATION);
    }

    public final int getTitleRes() {
        return 2131964358;
    }
}
