package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.FZt  reason: case insensitive filesystem */
public final class C50362FZt implements JQE {
    public final boolean A00;

    public C50362FZt(boolean z) {
        this.A00 = z;
    }

    public final int Az3() {
        return R.drawable.instagram_chest_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        C309516Yo A0M;
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        if (this.A00) {
            FFF.A03(userSession, "monetization", "bonuses_row_eligible");
            C47480E4f A03 = F9Y.A00().A03(userSession, "PRO_HOME", (String) null, (String) null);
            A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0B((Bundle) null, A03);
        } else {
            FFF.A03(userSession, "monetization", "bonuses_row");
            A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0B((Bundle) null, F5N.A00(ValuePropsFlow.BONUSES.A00, (String) null));
        }
        A0M.A04();
    }

    public final int getTitleRes() {
        return 2131966697;
    }
}
