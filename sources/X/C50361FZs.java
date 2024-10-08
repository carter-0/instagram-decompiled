package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.FZs  reason: case insensitive filesystem */
public final class C50361FZs implements JQE {
    public final boolean A00;

    public C50361FZs(boolean z) {
        this.A00 = z;
    }

    public final int Az3() {
        return R.drawable.instagram_badge_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        C309516Yo A0M;
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        if (this.A00) {
            FFF.A03(userSession, "monetization", "badges_row_eligible");
            KUY A002 = C49195Er0.A00().A00().A00("PRO_HOME", (String) null);
            A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0B((Bundle) null, A002);
        } else {
            FFF.A03(userSession, "monetization", "badges_row");
            A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0B((Bundle) null, F5N.A00(ValuePropsFlow.BADGES.A00, (String) null));
        }
        A0M.A04();
    }

    public final int getTitleRes() {
        return 2131966696;
    }
}
