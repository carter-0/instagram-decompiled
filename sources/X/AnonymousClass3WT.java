package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3WT  reason: invalid class name */
public enum AnonymousClass3WT {
    ANTI_BULLY_ENG_ONLY("anti_bully"),
    ANTI_BULLY_GLOBAL("anti_bully_speak_love"),
    AREFFECT("ar_effect_sticker"),
    BLOKS("bloks"),
    BLOKS_TAPPABLE("bloks_tappable"),
    CHALLENGE_CHAT("challenge_chat"),
    COLLAB("collab"),
    COLLECTION_AD_THUMBNAIL("collection_ad_thumbnail"),
    COUNTDOWN("countdown"),
    DISCUSSION("discussion"),
    DPA("dpa"),
    CTA("cta"),
    ELECTION("election"),
    FB_FUNDRAISER("fb_fundraiser"),
    FUNDRAISER("fundraiser"),
    HASHTAG("hashtag"),
    FEATURE_LINKING_STICKER("feature_linking_sticker"),
    KARAOKE_CAPTIONS("karaoke_captions"),
    LINK("story_link"),
    LOCATION("location"),
    INSTAPAL("instapal_sticker"),
    MEDIA("feed_media"),
    MEDIA_CTA("feed_media_cta"),
    MENTION("mention"),
    MENTION_RESHARE("mention"),
    GROUP_MENTION("group_mention"),
    MESSAGE_SHARE("message_share"),
    MUSIC_LYRICS("music_lyric"),
    MUSIC_OVERLAY("music"),
    POLLING("poll"),
    PRODUCT("shopping_product"),
    PROMPT("prompt"),
    PROMPT_V2_SHAREABLE("prompt_v2_shareable"),
    JOIN_CHAT("story_chat"),
    CLIPS_JOIN_CHAT("clips_chat"),
    CLIPS_PROMPT("clips_prompt"),
    MULTI_PRODUCT("shopping_multi_product"),
    PRODUCT_COLLECTION("shopping_seller_collection"),
    PRODUCT_SHARE("product_share"),
    QUESTION("question"),
    QUESTION_RESPONSE("question_response"),
    CLIPS_QUESTION_RESPONSE("clips_question_response"),
    QUIZ("quiz"),
    REELS_VISUAL_REPLIES("visual_comment_reply_sticker"),
    RESHARE_VIEW_SHOP_CTA("story_reshare_view_shop_cta"),
    SLIDER("slider"),
    SMB_SUPPORT("smb_support"),
    SOUND_ON("sound_on"),
    STOREFRONT("shopping_storefront"),
    UNKNOWN("unknown"),
    UPCOMING_EVENT("upcoming_event"),
    VOTER_REGISTRATION("voter_registration"),
    VOTING_INFO_CENTER("voting_info_center"),
    SUBSCRIPTIONS("subscriptions"),
    SUBSCRIPTION_SHOUTOUT("subscription_shoutout_mention_sticker"),
    REACTION("reaction_sticker"),
    BADGES_SUPPORTER_THANKS("badges_supporter_thank_you"),
    AVATAR("avatar"),
    FB_COMMUNITY("fb_community"),
    FB_TAG("fb_tag"),
    ROLL_CALL_FIRST_TAKE("roll_call_first_take"),
    MUSIC_PICK_STICKER("music_pick"),
    BEFORE_AND_AFTER("before_and_after"),
    TEXT_POST_STICKER("text_post_share_to_ig_story"),
    POLAROID_STICKER("polaroid_sticker"),
    PHOTO_CRED_STICKER("photo_credit_sticker"),
    EXPLORE_SHAREABLE_GRID("explore_shareable_grid"),
    CUTOUT_PHOTO("cutout_photo"),
    CUTOUT_VIDEO("cutout_video"),
    NOTIFY_ME("notify_me_sticker"),
    WHATSAPP_STICKER("whatsapp_sticker"),
    BIO_PRODUCT("ig_bio_sticker"),
    SECRET_STICKER("secret_sticker"),
    PUBLIC_COLLECTION("public_collection"),
    AI_STICKER("ai_sticker"),
    CLIPS_KARAOKE_CAPTIONS_STICKER("clips_karaoke_caption"),
    CLIPS_TEXT("clips_text"),
    ACHIEVEMENT_STICKER("achievement_sticker"),
    INTERNAL("internal"),
    CLIPS_SPIN_TEXT("clips_spin_text"),
    MEMORIES("memories"),
    FILLABLE("fillable");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass3WT[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass3WT r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass3WT(String str) {
        this.A00 = str;
    }
}
