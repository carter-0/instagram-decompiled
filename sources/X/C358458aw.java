package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8aw  reason: invalid class name and case insensitive filesystem */
public final class C358458aw {
    public final 0wc A00;

    public final void A00(boolean z, boolean z2, int i) {
        C391539tF r1;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_group_story_mention_toggle_state_changed");
        if (z2) {
            if (z) {
                r1 = C391539tF.ON;
            } else {
                r1 = C391539tF.OFF;
            }
        } else if (z) {
            r1 = C391539tF.DEFAULT_ON;
        } else {
            r1 = C391539tF.DEFAULT_OFF;
        }
        if (A002.isSampled()) {
            A002.A8M(r1, "action");
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "IG_STORY");
            A002.A9F("tagged_user_count", Long.valueOf((long) i));
            A002.Cgf();
        }
    }

    public C358458aw(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
