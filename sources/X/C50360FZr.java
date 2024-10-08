package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZr  reason: case insensitive filesystem */
public final class C50360FZr implements JQE {
    public final int Az3() {
        return R.drawable.instagram_ads_on_reels_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "monetization", "profile_feed_ads_row_eligible");
        Dbb.A0o((Bundle) null, FCL.A00().A00(IGRevShareProductType.REELS_OVERLAY_ADS, "PRO_HOME", (String) null), fragmentActivity, userSession);
    }

    public final int getTitleRes() {
        return 2131966704;
    }
}
