package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Nt2  reason: case insensitive filesystem */
public abstract class C69838Nt2 {
    public static final String A00(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return "story";
            case 2:
                return "search";
            case 3:
                return "new_group";
            case 4:
                return "send_to";
            case 5:
            case 6:
            case 19:
            case 31:
                return "suggested";
            case 7:
                return "recent";
            case 8:
                return "alphabetical";
            case 9:
                return "group_stories";
            case 11:
                return "facebook_friends";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "instagram_non_contacts";
            case 13:
                return "facebook_non_friends";
            case 14:
                return "not_following_recipients";
            case 15:
                return "facebook_friends_see_all";
            case 16:
                return "instagram_non_contacts_see_all";
            case 17:
                return "facebook_non_friends_see_all";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "recent_see_all";
            case 21:
                return "instagram_business_only_non_contacts";
            case 22:
                return "instagram_business_only_non_contacts_see_all";
            case 23:
                return "instagram_people_only_non_contacts";
            case 24:
                return "instagram_people_only_non_contacts_see_all";
            case 25:
                return "messages";
            case 26:
                return "instagram_in_this_story_mention";
            case 28:
                return "relevant_shares";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "latest_shares";
            case 30:
                return "channels";
            case 32:
                return "occamadillo";
            case 33:
                return "categories";
            case 35:
                return "ai_agents";
            case 36:
                return "ai_agents_see_all";
            case 37:
                return "channels_see_all";
            case 38:
                return "ai_picker";
            case 40:
                return "null_state_suggested_prompt";
            case Seq.NULL_REFNUM:
                return "meta_ai_typeahead_prompt";
            case 43:
                return "invite_contact";
            default:
                throw DbW.A0a("Invalid section: ", i);
        }
    }
}
