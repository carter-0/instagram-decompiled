package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZu  reason: case insensitive filesystem */
public final class C50363FZu implements JQE {
    public final int A00;

    public final int getTitleRes() {
        return this.A00;
    }

    public C50363FZu(UserSession userSession) {
        this.A00 = C49785F6t.A01(userSession) ? 2131966707 : 2131966706;
    }

    public final int Az3() {
        return R.drawable.instagram_circle_dollar_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "monetization", "profile_feed_ads_row_eligible");
        Dbb.A0o((Bundle) null, FCL.A00().A00(IGRevShareProductType.PROFILE_ADS, "PRO_HOME", (String) null), fragmentActivity, userSession);
    }
}
