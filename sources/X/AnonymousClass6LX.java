package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6LX  reason: invalid class name */
public abstract class AnonymousClass6LX {
    public static final String A00(UserSession userSession, int i) {
        if (i == 14) {
            return "smb_support_reshare";
        }
        if (i == 16) {
            return "creator_fan_engagement_reshare";
        }
        if (i == 50) {
            return "50";
        }
        if (i == 32) {
            return "302";
        }
        if (i == 33) {
            return "stories_gallery_template";
        }
        if (i == 54) {
            return "54";
        }
        if (i == 55) {
            return "hands_free_sharing";
        }
        switch (i) {
            case 0:
                return "4";
            case 1:
                return "3";
            case 2:
                return "6";
            case 3:
                return "9";
            case 4:
                return AnonymousClass000.A00(3122);
            case 5:
                return AnonymousClass000.A00(1745);
            case 6:
                return "question_response_reshare";
            default:
                switch (i) {
                    case 8:
                        return "product_reshare";
                    case 9:
                        return "countdown_reshare";
                    case 10:
                        return "otd_reshare";
                    case 11:
                        return "fundraiser_dupicate_sticker_prompt";
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        return "fundraiser_public_thanks_sticker_prompt";
                    default:
                        switch (i) {
                            case 20:
                                return "upcoming_event_reshare";
                            case 21:
                                return "link_share";
                            case 22:
                                return "standalone_fundraiser_sticker_share";
                            case 23:
                                return "group_profile_reshare";
                            case 24:
                                return "memory_pog_reshare";
                            default:
                                switch (i) {
                                    case 26:
                                        return "fb_post_reshare";
                                    case 27:
                                        return "channel_share";
                                    case 28:
                                        return AnonymousClass000.A00(3071);
                                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                                        return "follower_milestone";
                                    case 30:
                                        return "48";
                                    default:
                                        switch (i) {
                                            case 61:
                                                return "stories_templates";
                                            case 62:
                                                return "channel_challenge_share";
                                            case 63:
                                                return "music_first_story";
                                            default:
                                                switch (i) {
                                                    case 108:
                                                        return "108";
                                                    case 109:
                                                        return "109";
                                                    case 110:
                                                        return "14";
                                                    case 111:
                                                        return "5";
                                                    case 112:
                                                        return "profile_card_share";
                                                    case 113:
                                                        return "quick_snap_recap_share";
                                                    default:
                                                        if (userSession == null || 182.A06(0Tu.A05, userSession, 36328014505589614L)) {
                                                            return "-1";
                                                        }
                                                        throw new UnsupportedOperationException(002.A0O("Unknown source type: ", i));
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
