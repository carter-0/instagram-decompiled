package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8aR  reason: invalid class name and case insensitive filesystem */
public final class C358148aR {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public C358148aR(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public static final void A00(C358148aR r5, Integer num, Integer num2, Integer num3, Long l, String str) {
        String str2;
        String str3;
        UserSession userSession = r5.A01;
        0wc A012 = AnonymousClass0kN.A01(r5.A00, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_sticker_anything_action_event");
        if (A002.isSampled()) {
            A002.AAJ("action", str);
            String str4 = 27p.A01(userSession).A04.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A002.AAJ("camera_session_id", str4);
            switch (num.intValue()) {
                case 0:
                    str2 = "photo_post";
                    break;
                case 1:
                    str2 = "gallery";
                    break;
                case 2:
                    str2 = "story";
                    break;
                case 3:
                    str2 = "clip";
                    break;
                default:
                    str2 = "";
                    break;
            }
            A002.AAJ("surface", str2);
            A002.A9F("num_of_dots_in_manual_seg", l);
            String str5 = null;
            if (num2 == null) {
                str3 = null;
            } else if (1 - num2.intValue() != 0) {
                str3 = "photo";
            } else {
                str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
            }
            A002.AAJ("media_type", str3);
            if (num3 != null) {
                str5 = C63131Krz.A00(num3);
            }
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
            A002.Cgf();
        }
    }

    public static final void A01(C358148aR r4, String str) {
        A00(r4, AnonymousClass05K.A0Y, (Integer) null, (Integer) null, (Long) null, str);
    }
}
