package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

public final class FBD {
    public static final FBD A00 = new Object();

    public final AnonymousClass3M3 A00(FragmentActivity fragmentActivity, AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, HashMap hashMap) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        02m.A0p.markerStart(790826917, 0);
        02m r2 = 02m.A0p;
        r2.markerAnnotate(790826917, AnonymousClass9NE.A00(), 0);
        r2.markerAnnotate(790826917, "analytics_module", r7.getModuleName());
        r2.markerAnnotate(790826917, "location", str);
        r2.markerAnnotate(790826917, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        r2.markerAnnotate(790826917, "nua_action", str3);
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(560), hashMap);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(fragmentActivity, A0N, 2131964964);
        A0N.A03 = C47546E7j.A00;
        A0N.A0l = 182.A06(0Tu.A05, userSession, 2342158422285225131L);
        return C49891FBs.A02(A0N, A04);
    }
}
