package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.UzA  reason: case insensitive filesystem */
public enum C16674UzA {
    SIDECAR("media/configure_sidecar/"),
    NAMETAG("media/configure_to_nametag/"),
    IGTV("media/configure_to_igtv/"),
    FEED("media/configure/"),
    FINISH("media/upload_finish/"),
    QUALITY_REPORT("media/update_video_with_quality_info/"),
    PDQ_HASH_REPORT("media/update_media_with_pdq_hash_info/"),
    CLIPS("media/configure_to_clips/"),
    CLIPS_ASYNC("media/upload_clips_configure_params/"),
    CONFIGURE_STATUS_CLIPS("media/clips_configure_status/"),
    CONFIGURE_STATUS_STORY("media/story_configure_status/"),
    MEDIA_KIT("media/configure_to_media_kit_cover/"),
    TEXT_ONLY("media/configure_text_only_post/"),
    TEXT_APP_FEED("media/configure_text_post_app_feed/"),
    TEXT_APP_SIDECAR("media/configure_text_post_app_sidecar/"),
    RAVEN("direct_v2/threads/broadcast/raven_attachment/"),
    OPEN_CAROUSEL_SUBMISSION("media/configure_to_open_carousel/"),
    CUTOUT_STICKER("media/configure_to_cutout_sticker/"),
    STORY_TEMPLATE_ASSET("media/configure_to_story_template_asset/"),
    CLIPS_TEMPLATE_REUSABLE_ASSETS("media/configure_to_reusable_template_assets/"),
    VIDEO_IN_NOTE_POG("media/configure_to_note_pog_video/"),
    OPEN_CAROUSEL_ACCEPTANCE("media/manage_submitted_sub_post/"),
    WONDER_WALL("media/configure_to_wall/"),
    QUICKSNAP("media/configure_to_quick_snap/"),
    POTATO("media/configure_potato/");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C16674UzA[] uzAArr;
        A01 = 0oU.A00(uzAArr);
    }

    public final void A00(1NY r3, UserSession userSession, StringBuilder sb) {
        if ((this instanceof C16125UpC) || (this instanceof C16126UpD) || (this instanceof C16124UpB)) {
            sb.append(this.A00);
            Pair A002 = C278474ww.A00(userSession);
            Object obj = A002.first;
            0qQ.A06(obj);
            r3.A0G((String) obj, (String) A002.second);
            return;
        }
        sb.append(this.A00);
    }

    /* access modifiers changed from: public */
    C16674UzA(String str) {
        this.A00 = str;
    }
}
