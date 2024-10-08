package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.LSw  reason: case insensitive filesystem */
public abstract class C64189LSw {
    public static final void A05(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        0Aj A00 = A00(userSession);
        A02(A00, A01(A00, A0J, "primary_click", str), str2, str3);
    }

    public static String A01(0Aj r1, 16V r2, String str, String str2) {
        r1.AAJ(TraceFieldType.AdhocEventName, str);
        r1.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        if (r2 != null) {
            return String.valueOf(r2.A00);
        }
        return null;
    }

    public static void A02(0Aj r3, String str, String str2, String str3) {
        r3.AAJ("ig_user_account_type", str);
        r3.AAJ(AnonymousClass9NJ.A00(51, 10, 54), str2);
        r3.AAJ("waterfall_id", str3);
        r3.Cgf();
    }

    public static 0Aj A00(0lg r2) {
        0wc A02 = AnonymousClass0kN.A02(r2);
        0Aj A00 = A02.A00(A02.A00, "ig_xposting_to_fb_client");
        A00.AAJ(AnonymousClass000.A00(3137), "ig_feed_crossposting_to_fb");
        return A00;
    }

    public static final void A03(UserSession userSession, ShareType shareType, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(userSession, shareType);
        if (str != null) {
            16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
            if (shareType == ShareType.FOLLOWERS_SHARE || (shareType == ShareType.IGTV && str.equals("video_feed_composer"))) {
                0Aj A00 = A00(userSession);
                A02(A00, A01(A00, A0J, "failure", str), str2, str3);
            }
        }
    }

    public static final void A04(UserSession userSession, ShareType shareType, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(userSession, shareType);
        if (str != null) {
            16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
            if (shareType == ShareType.FOLLOWERS_SHARE || (shareType == ShareType.IGTV && str.equals("video_feed_composer"))) {
                0Aj A00 = A00(userSession);
                A02(A00, A01(A00, A0J, RealtimeConstants.SEND_SUCCESS, str), str2, str3);
            }
        }
    }
}
