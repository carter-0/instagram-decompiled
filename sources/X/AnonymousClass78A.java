package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.78A  reason: invalid class name */
public abstract class AnonymousClass78A {
    public static final void A00(UserSession userSession, AnonymousClass789 r11, User user, String str, boolean z) {
        User user2;
        02m r2 = 02m.A0p;
        r2.markerStart(190452164);
        r2.markerAnnotate(190452164, "can_bypass_cache", z);
        r2.markerAnnotate(190452164, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36319802528112294L)) {
            user2 = 17h.A00(userSession).A02(user.getId());
        } else {
            user2 = null;
        }
        boolean z2 = false;
        boolean z3 = false;
        if (user2 != null) {
            z3 = true;
        }
        r2.markerAnnotate(190452164, "has_cached_user", z3);
        if (user2 == null || (z && user2.A03.CYa() == null && 182.A06(r7, userSession, 2342161935568739073L))) {
            r2.markerPoint(190452164, "fetching_creator_info_with_cache_bypass");
            AnonymousClass92n.A00(new C3269978y(r2, r11), userSession, user, str, false);
            r11.DLh(false);
            return;
        }
        AnonymousClass16x AsZ = user2.A03.AsZ();
        if (AsZ != null) {
            z2 = 0qQ.A0K(AsZ.CQk(), true);
        }
        r11.DLh(z2);
        r2.markerEnd(190452164, 2);
    }
}
