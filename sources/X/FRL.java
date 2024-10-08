package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public abstract class FRL implements CallerContextable {
    public static final String __redex_internal_original_name = "SwitchToBusinessUtil";

    public static final 1NY A00(UserSession userSession, 16V r5, String str) {
        boolean z = false;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("business/account/convert_account/");
        A0a.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0a.A0Q(C3727892k.class, C3727992l.class);
        if (r5 == 16V.A06) {
            z = true;
        }
        A0a.A0H("creator_destination_migration", z);
        if (r5 != 16V.A08) {
            A0a.A9m("to_account_type", String.valueOf(r5.A00));
        }
        return A0a;
    }
}
