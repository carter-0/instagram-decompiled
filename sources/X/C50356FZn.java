package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZn  reason: case insensitive filesystem */
public final class C50356FZn implements JQE {
    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TF.A1H(fragmentActivity, userSession);
        FFF.A03(userSession, "monetization", "gifts_row_eligible");
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0B((Bundle) null, AnonymousClass2BF.A00().A02().A00(userSession, "PRO_HOME", (String) null, (String) null, false));
        A0M.A04();
    }

    public final int Az3() {
        return R.drawable.instagram_gift_box_pano_outline_24;
    }

    public final int getTitleRes() {
        return 2131966701;
    }
}
