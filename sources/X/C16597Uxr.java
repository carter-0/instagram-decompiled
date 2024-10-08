package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxr  reason: case insensitive filesystem */
public enum C16597Uxr {
    BITMAP("bitmap"),
    TIME("time"),
    UNIVERSAL_LOCATION("universal_location"),
    GEO_STICKER("geo_sticker"),
    HASHTAG_STICKER("hashtag_sticker"),
    MENTION("mention"),
    SHOPPING_STICKER("shopping_sticker"),
    PRODUCT_ITEM_STICKER("product_item_sticker"),
    PRODUCT_SHARE_STICKER("product_share_sticker"),
    SHOPPING_COLLECTION_SHARE_STICKER("shopping_collection_share_sticker"),
    SHOP_SHARE_STICKER("shop_share_sticker"),
    MUSIC_OVERLAY_STICKER("music_overlay_sticker"),
    MUSIC_TRACK_PREVIEW_STICKER("music_track_preview_sticker"),
    LYRICS("lyrics"),
    KARAOKE_CAPTION_STICKER("karaoke_caption_sticker"),
    COUNTDOWN_STICKER("countdown_sticker"),
    REELS_VISUAL_REPLIES_STICKER("reels_visual_replies_sticker"),
    FUNDRAISER_STICKER("fundraiser_sticker"),
    FUNDRAISER_STICKER_THANKS("fundraiser_sticker_thanks"),
    POLLING_STICKER("polling_sticker"),
    POLL_STICKER_V2("poll_sticker_v2"),
    QUESTION_STICKER("question_sticker"),
    QUESTION_RESPONSE_RESHARE("question_response_reshare"),
    ANONYMOUS_QUESTION_STICKER("anonymous_question_sticker"),
    CLIPS_QUESTION_STICKER("clips_question_sticker"),
    QUIZ_STICKER("quiz_sticker"),
    SLIDER_STICKER("slider_sticker"),
    MEDIA("media"),
    GIF_SEARCH("gif_search"),
    GIF("gif"),
    GALLERY_BROWSE("gallery_browse"),
    GALLERY("gallery"),
    GUIDE("guide"),
    INTERNAL_STICKER("internal_sticker"),
    ELECTION_STICKER("election_sticker"),
    MEMORIES_STICKER("memories_sticker"),
    ANTI_BULLY_ENG_ONLY("anti_bully_eng_only"),
    ANTI_BULLY_STICKER("anti_bully_sticker"),
    ANTI_BULLY_GLOBAL_STICKER("anti_bully_global_sticker"),
    VOTER_REGISTRATION_STICKER("voter_registration_sticker"),
    SMB_GIFT_CARD_STICKER("smb_gift_card_sticker"),
    SMB_SUPPORT_STICKER("smb_support_sticker"),
    SMB_DELIVERY_STICKER("smb_delivery_sticker"),
    SMB_GET_QUOTE_STICKER("smb_get_quote_sticker"),
    SHARE_PROFESSIONAL_PROFILE_STICKER("share_professional_profile_sticker"),
    PROFILE_STICKER("profile_sticker"),
    AMPLIFY_DIVERSITY_BUSINESS_PROFILE_STICKER("amplify_diversity_business_profile_sticker"),
    GROUP_POLL_STICKER("group_poll_sticker"),
    BLOKS_STICKER("bloks_sticker"),
    BLOKS_ANIMATED("bloks_animated"),
    NORMAL("normal"),
    VOTING_INFO_CENTER("voting_info_center"),
    UPCOMING_EVENT_STICKER("upcoming_event_sticker"),
    SHARE_PLATFORM("share_platform"),
    FB_COMMUNITY("fb_community"),
    FB_TAG("fb_tag"),
    RESHARE_STICKER("reshare_sticker"),
    SUPPORT_PERSONALIZED_ADS_STICKER("support_personalized_ads_sticker"),
    LINK_STICKER("link_sticker"),
    USER_PAY_BADGES_THANKS_STICKER("user_pay_badges_thanks_sticker"),
    I_TAKE_CARE_STICKER("i_take_care_sticker"),
    KEYBOARD_CONTENT_STICKER("keyboard_content_sticker"),
    PROMPT_STICKER("prompt_sticker"),
    AVATAR_SEARCH("avatar_search"),
    AVATAR("avatar"),
    SUBSCRIPTIONS_STICKER("subscriptions_sticker"),
    REACTION_STICKER("reaction_sticker"),
    CLIPS_PROMPT_STICKER("clips_prompt_sticker"),
    JOIN_CHAT_STICKER("join_chat_sticker"),
    SUBSCRIBER_CHAT_STICKER("subscriber_chat_sticker"),
    AVATAR_STATIC("avatar_static"),
    AVATAR_ANIMATED("avatar_animated"),
    PLACEHOLDER_STICKER("placeholder_sticker"),
    IG_FEATURE_LINKING_STICKER("ig_feature_linking_sticker"),
    MESSAGE_SHARE("message_share"),
    MEMORIES("memories"),
    BEFORE_AND_AFTER_STICKER("before_and_after_sticker"),
    GROUP_MENTION_STICKER("group_mention_sticker"),
    SUPERLATIVE_STORY("superlative_story"),
    EVENT_STICKER("event_sticker"),
    AI_STICKER_SEARCH("ai_sticker_search"),
    AI_STICKER("ai_sticker"),
    FOLLOWER_MILESTONE_STICKER("follower_milestone_sticker"),
    STORIES_TEMPLATE("stories_template"),
    CUT_OUT_STICKER("cut_out_sticker"),
    CUTOUT_STICKER_CONTENT("cutout_sticker_content"),
    POLAROID_STICKER("polaroid_sticker"),
    MAGIC_MOD_ADD_YOURS_BACKDROP("magic_mod_add_yours_backdrop"),
    MAGIC_MOD_BACKDROP("magic_mod_backdrop"),
    MAGIC_MOD_RESTYLE("magic_mod_restyle"),
    CUTOUT_VIDEO_STICKER_CONTENT("cutout_video_sticker_content"),
    STORIES_TEMPLATE_GALLERY_OVERLAY("stories_template_gallery_overlay"),
    EXPLORE_SHAREABLE_GRID("explore_shareable_grid"),
    PHOTO_CRED("photo_cred"),
    TEXT("text"),
    ELECTION_ADD_YOURS("election_add_yours"),
    NOTIFY_ME("notify_me"),
    IGBIO_PRODUCT("igbio_product"),
    MUSIC_PICK_STICKER("music_pick_sticker"),
    PUBLIC_COLLECTION_STICKER("public_collection_sticker"),
    FITNESS_STICKER("fitness_sticker"),
    UNKNOWN("");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16597Uxr[] uxrArr;
        A02 = 0oU.A00(uxrArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (C16597Uxr uxr : values()) {
            linkedHashMap.put(uxr.A00, uxr);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16597Uxr(String str) {
        this.A00 = str;
    }
}
