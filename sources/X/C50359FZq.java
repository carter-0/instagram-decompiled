package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FZq  reason: case insensitive filesystem */
public final class C50359FZq implements JQE {
    public final int Az3() {
        return R.drawable.instagram_money_pano_outline_24;
    }

    public final void D1y(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        FFF.A03(userSession, "creator_tools_main_page", "monetization_tools_row");
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        C47440E2m e2m = new C47440E2m();
        DbZ.A1B(e2m, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (Object) null);
        A0M.A0B((Bundle) null, e2m);
        A0M.A04();
    }

    public final int getTitleRes() {
        return 2131966698;
    }
}
