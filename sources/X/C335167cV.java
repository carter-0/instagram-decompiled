package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.7cV  reason: invalid class name and case insensitive filesystem */
public final class C335167cV implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AvatarStickerSuggestionLogger";
    public final 0wc A00;
    public final UserSession A01;

    public C335167cV(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void A00(Integer num, String str, long j, long j2) {
        String str2;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "contextual_recommendations_avatar_banner_event");
        if (A002.isSampled()) {
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            0eP r6 = new 0eP("composer_session_id", str);
            switch (num.intValue()) {
                case 0:
                    str2 = "impression";
                    break;
                case 1:
                    str2 = "dismiss";
                    break;
                default:
                    str2 = "enable";
                    break;
            }
            0eP r7 = new 0eP("action", str2);
            UserSession userSession = this.A01;
            0Tu r4 = 0Tu.A05;
            A002.A9H("extra_client_data", 0Yt.A06(new 0eP[]{r6, r7, new 0eP("decay_length", String.valueOf(182.A01(r4, userSession, 36604528795259967L))), new 0eP("impression_limit", String.valueOf(182.A01(r4, userSession, 36604528795325504L))), new 0eP("impression_count", String.valueOf(j)), new 0eP("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT), new 0eP("cool_down_phase", String.valueOf(j2))}));
            A002.Cgf();
        }
    }
}
