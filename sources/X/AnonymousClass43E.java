package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.43E  reason: invalid class name */
public final class AnonymousClass43E {
    public final 02m A00 = 02m.A0p;

    public AnonymousClass43E(UserSession userSession) {
        0qQ.A0B(userSession, 1);
    }

    public final void A00(Integer num) {
        String str;
        02m r3 = this.A00;
        r3.markerStart(275915176);
        switch (num.intValue()) {
            case 0:
                str = "direct_notes_tray";
                break;
            case 1:
                str = "content_note";
                break;
            case 2:
                str = "friends_map_note";
                break;
            case 3:
                str = "profile_wall";
                break;
            case 4:
                str = "profile_note";
                break;
            case 5:
                str = "feed_netego";
                break;
            default:
                str = "music_note_reshare";
                break;
        }
        r3.markerAnnotate(275915176, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }
}
