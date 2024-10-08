package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class PQ4 implements G6O {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.1pl] */
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        int A02 = DbW.A02(1, userSession, fragmentActivity);
        if (1pl.A00 == null) {
            1pl.A00 = new Object();
        }
        1pl A00 = O3B.A00();
        0xG A0O = DbS.A0O(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        C21270XRp xRp = C21270XRp.A0y;
        AnonymousClass7TF.A1C(A0O, A02, xRp);
        1pl.A00(fragmentActivity2, A0O, userSession2, xRp, A00, (String) null, (String) null).A04();
    }
}
