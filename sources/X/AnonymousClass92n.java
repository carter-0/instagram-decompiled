package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;

/* renamed from: X.92n  reason: invalid class name */
public abstract class AnonymousClass92n {
    public static final void A00(1P0 r6, UserSession userSession, User user, String str, boolean z) {
        AnonymousClass16x AsZ = user.A03.AsZ();
        if (AsZ != null) {
            AsZ.Ase();
        }
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("creator/creator_info/");
        r2.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
        r2.A9m("surface_type", "android");
        if (z) {
            str = "self_profile";
        }
        r2.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        r2.A0O((15p) null, AnonymousClass92o.class, AnonymousClass92p.class, false);
        1OC A0M = r2.A0M();
        A0M.A00 = r6;
        1ES.A05(A0M, 1653838317, 3, true, true);
    }
}
