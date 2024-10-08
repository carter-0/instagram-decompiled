package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.EsP  reason: case insensitive filesystem */
public abstract class C49280EsP {
    public static final Set A00;

    static {
        String str;
        ArrayList A0v = DbS.A0v(r2);
        for (Integer intValue : AnonymousClass05K.A00(38)) {
            switch (intValue.intValue()) {
                case 1:
                    str = "profile";
                    break;
                case 2:
                    str = "join_subscription_notification";
                    break;
                case 3:
                    str = "fan_manage";
                    break;
                case 4:
                    str = "profile_upsell";
                    break;
                case 5:
                    str = "fan_qp_upsell";
                    break;
                case 6:
                    str = "creator_manage";
                    break;
                case 7:
                    str = "live_upcoming_event";
                    break;
                case 8:
                    str = "exclusive_effect_bottom_sheet";
                    break;
                case 9:
                    str = "promo_story_sticker";
                    break;
                case 10:
                    str = "promo_reels_viewer";
                    break;
                case 11:
                    str = "profile_tab";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "join_chat_story_sticker_subscriber_chat";
                    break;
                case 13:
                    str = "live_pinned_view";
                    break;
                case 14:
                    str = "available_creators_notification";
                    break;
                case 15:
                    str = "suggested_subscriptions_netego";
                    break;
                case 16:
                    str = "subscribed_list_in_follow_connected";
                    break;
                case 17:
                    str = "subscribed_list_in_follow_unconnected";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    str = "recommendations_list_in_sub_feed";
                    break;
                case 19:
                    str = "content_preview_activation_card";
                    break;
                case 20:
                    str = "content_preview_attribution";
                    break;
                case 21:
                    str = "new_story";
                    break;
                case 22:
                    str = "fan_referral_dm";
                    break;
                case 23:
                    str = "invite_link_preview_broadcast_chat";
                    break;
                case 24:
                    str = "message_in_story";
                    break;
                case 25:
                    str = "clips_chat_sticker";
                    break;
                case 26:
                    str = "expired_gifted_sub_notification";
                    break;
                case 27:
                    str = "fan_onboarding_qp";
                    break;
                case 28:
                    str = "profile_subscriber_channel_click";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    str = "inbox_search";
                    break;
                case 30:
                    str = "subscriber_shoutout";
                    break;
                case 31:
                    str = "ssc_invite_notification";
                    break;
                case 32:
                    str = "subscribe_cta_in_feed";
                    break;
                case 33:
                    str = "subscribe_cta_in_reels";
                    break;
                case 34:
                    str = "deep_link";
                    break;
                case 35:
                    str = "stories_teaser";
                    break;
                case 36:
                    str = "stories_highlight_teaser";
                    break;
                case 37:
                    str = "reels_end_card";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            A0v.add(str);
        }
        A00 = 00k.A0k(A0v);
    }
}
