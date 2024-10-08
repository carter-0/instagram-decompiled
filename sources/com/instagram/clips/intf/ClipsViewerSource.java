package com.instagram.clips.intf;

import X.0oU;
import X.0qQ;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;

public enum ClipsViewerSource implements Parcelable {
    ACCOUNT_INSIGHTS("account_insights"),
    ACTIVITY_CENTER("activity_center"),
    ADS_HISTORY("ads_history"),
    AR_EFFECT("effect_page"),
    AUDIO_NETEGO_PAGE("audio_netego_page"),
    AUDIO_PAGE_IN_CREATION("audio_page_in_creation"),
    BLEND("clips_blend"),
    BLOKS("bloks"),
    CAMERA_INSPIRATION_HUB("camera_inspiration_hub"),
    FEED_CONTEXTUAL_CHAIN("feed_contextual_chain"),
    CONTEXTUAL_HIGHLIGHT_CHAIN("contextual_chain"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    DIRECT_SEARCH("direct_search"),
    DIRECT_AD_FEED_OF_ADS("direct_ad_feed_of_ads"),
    EXPLORE_GRID_AD_FEED_OF_ADS("explore_grid_ad_feed_of_ads"),
    EXPLORE_POPULAR_DEFAULT_UNIT("explore_popular_default_unit"),
    EXPLORE_INTEREST_DEFAULT_UNIT("explore_interest_default_unit"),
    EXPLORE_POPULAR_MAJOR_UNIT("explore_popular_major_unit"),
    EXPLORE_POPULAR_MINOR_UNIT("explore_popular_minor_unit"),
    EXPLORE_TRENDING_MINOR_UNIT("explore_trending_minor_unit"),
    EXPLORE_NEARBY_MINOR_UNIT("explore_nearby_minor_unit"),
    EXPLORE_INTEREST_MINOR_UNIT("explore_interest_minor_unit"),
    EXPLORE_POPULAR_AGGREGATE_TREND_MINOR_UNIT("explore_popular_aggregate_trend_minor_unit"),
    EXPLORE_VYML("explore_event_viewer"),
    EXPLORE_VIDEO_CHAINING("explore_video_chaining"),
    EXPLORE_TILE_TWO_BY_TWO("explore_tile_2x2"),
    CREATOR_INSPIRATION_HUB("creator_inspiration_hub"),
    FEED_LIKED("feed_liked"),
    CLIPS_FEED_LIKED("clips_feed_liked"),
    FEED_TIMELINE("feed_timeline"),
    FEED_TIMELINE_EXPLORE_STORY("feed_timeline_explore_story"),
    FEED_TIMELINE_MIXED_UNCONNECTED("feed_timeline_mixed_unconnected"),
    FEED_TIMELINE_FOLLOWING("feed_timeline_following"),
    FEED_TIMELINE_FAVORITES("feed_timeline_favorites"),
    FEED_TIMELINE_POST_TAP("feed_timeline_post_tap"),
    FEED_TIMELINE_SEED_AD("feed_timeline_seed_ad"),
    FEED_TIMELINE_FEED_OF_ADS("feed_timeline_feed_of_ads"),
    FEED_MULTI_ADS("feed_multi_ads"),
    FEED_MULTI_ADS_AD_CHAIN("feed_multi_ads_ad_chain"),
    FEED_PAE_MULTI_ADS("feed_pae_multi_ads"),
    FEED_PAE_MULTI_ADS_AD_CHAIN("feed_pae_multi_ads_ad_chain"),
    FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE("feed_pae_multi_ads_watch_and_browse"),
    FEED_SA_MULTI_ADS_WATCH_AND_BROWSE("feed_sa_multi_ads_watch_and_browse"),
    FEED_ADS_WATCH_AND_BROWSE("feed_timeline_watch_and_browse"),
    FEED_ADS_WATCH_AND_BROWSE_WITH_CHAINING("feed_timeline_watch_and_browse_with_chaining"),
    FEED_ADS_TALL_VIDEO_WATCH_AND_BROWSE_WITH_CHAINING("feed_timeline_tall_video_watch_and_browse_with_chaining"),
    HASHTAG("feed_hashtag"),
    IP_DISCOVER_ACCOUNTS("ip_discover_accounts"),
    LOCATION("discovery_map_location_detail"),
    KEYWORD("feed_keyword_minor_unit"),
    NEWSFEED_YOU("newsfeed_you"),
    PLAYLIST_NEWSFEED_YOU("playlist_newsfeed_you"),
    PROFILE("clips_profile"),
    GROUP_PROFILE("clips_group_profile"),
    REMIX_REEL("remix_reel"),
    REMIX_REEL_CTA("remix_reel_cta"),
    REMIX_REEL_NOTIFICATION_REMINDER("remix_reel_notification_reminder"),
    REMIX_ORIGINAL_REEL("remix_original_reel"),
    SEQUENCE_REEL("sequence_reel"),
    SEQUENCE_REEL_CTA("sequence_reel_cta"),
    SEQUENCE_ORIGINAL_REEL("sequence_original_reel"),
    FEED_CONTEXTUAL_PROFILE("feed_contextual_profile"),
    FEED_CONTEXTUAL_GROUP_PROFILE("feed_contextual_group_profile"),
    PLAYLIST_PUSH_NOTIF("playlist_push_notif"),
    PUSH_NOTIF("push_notif"),
    LIVE_PUSH_NOTIF("live_push_notif"),
    POST_LIVE("post_live"),
    REEL_FEED_TIMELINE("reel_feed_timeline"),
    REEL_CLIPS_NETEGO("reel_clips_netego"),
    SELF_PROFILE("self_clips_profile"),
    SERP_REELS_SUBTAB("serp_reels_subtab"),
    SERP_REELS_TRENDS_HCM("serp_reels_trends_hcm"),
    SERP_TOP_MINOR_UNIT("serp_top_minor_unit"),
    SERP_TOP_MIXED_CONTENT_MINOR_UNIT("serp_top_mixed_content_minor_unit"),
    SHOPPING_HOME("shopping_home"),
    SHOPPING_RECON_DESTINATION("shopping_reconsideration_destination"),
    PROMOTE_FLOW_ADS_PREVIEW("promote_flow_ads_preview"),
    FEED_CONTEXTUAL_SELF_PROFILE("feed_contextual_self_profile"),
    SAVE_COLLECTION("feed_contextual_saved_collections"),
    SONG("audio_page"),
    AUDIO_PAGE_CHAIN("audio_page_chain"),
    THIRD_PARTY_URL("third_party_url"),
    TRENDS_PAGE("trends_page"),
    CLIPS_SAVED_TAB("feed_saved_collections_clips"),
    CLIPS_TAB("clips_tab"),
    CLIPS_CONNECTED("clips_connected"),
    CLIPS_NEARBY("clips_location"),
    CLIPS_NETEGO("clips_netego"),
    CLIPS_MEDIA_NOTES("clips_media_notes"),
    CLIPS_MEDIA_NOTES_NOTIF_CHAIN("clips_media_notes_notif_chain"),
    CLIPS_FRIENDLY_VIEWER_DOGFOODING("clips_friendly_viewer_dogfooding"),
    CLIPS_MULTI_ADS("clips_multi_ads"),
    CLIPS_MULTI_ADS_WATCH_AND_BROWSE("clips_multi_ads_watch_browse"),
    CLIPS_MULTI_ADS_FEED_OF_ADS("clips_multi_ads_feed_of_ads"),
    CLIPS_MUSIC_DROPS_NETEGO("clips_music_drops_netego"),
    CLIPS_PAE_MULTI_ADS_FEED_OF_ADS("clips_pae_multi_ads_feed_of_ads"),
    CLIPS_MULTI_ADS_SEED_AD("clips_multi_ads_seed_ad"),
    CLIPS_PAE_MULTI_ADS_SEED_AD("clips_pae_multi_ads_seed_ad"),
    CLIPS_QUICK_PROMOTION_IN_FEED_UNIT("clips_qp_netego"),
    CLIPS_SUGGESTED_FEED_CONTEXTUAL_CHAIN("clips_suggested_feed_contextual_chain"),
    CLIPS_TEMPLATE("clips_template"),
    CLIPS_TRENDING_IN_FEED_UNIT("clips_trending_netego"),
    CLIPS_VOICEOVER("clips_voiceover"),
    CLIPS_PROMPT("clips_prompt"),
    CLIPS_OVERLAY_WATCH_MORE_REELS("clips_overlay_watch_more_reels"),
    MIXED_MEDIA_CHAINS("mixed_media_chains"),
    STAR_SEARCH("star_search"),
    ADS_ONLY("ads_only"),
    LIVE_SHOPPING_NETEGO("live_shopping_netego"),
    THREADS_APP("threads_app"),
    IGTV_APP("igtv_app"),
    ORIGINAL_CREATOR_VIDEO("original_creator_video"),
    VISUAL_REPLY("visual_reply"),
    CLIPS_QUESTION_RESPONSE("question_response"),
    SERIES("series"),
    BREAKING_CREATOR_LABEL("breaking_creator_label"),
    MONETIZATION_INBOX("monetization_inbox"),
    SAVED_AUDIO_NOTIFICATION("saved_audio_notification"),
    RECENTLY_DELETED("recently_deleted"),
    SIMILAR_CREATORS("similar_creators"),
    FEED_CONTEXTUAL_FAN_CLUB("feed_contextual_fan_club"),
    FEED_CONTEXTUAL_SELF_FAN_CLUB("feed_contextual_self_fan_club"),
    FAN_CLUB("fan_club"),
    GROUP_PROFILE_PENDING_POSTS("group_profile_pending_posts"),
    BOARDS("boards"),
    RBS_PIVOT_PAGE("rbs_pivot_page"),
    THIRD_PARTY_APP_PIVOT_PAGE("third_party_app_pivot_page"),
    MID_CARD("mid_card"),
    MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS("midcard_trending_track_with_similar_accounts"),
    MID_CARD_OPEN_REELS_CHAIN("mid_card_open_reels_chain"),
    MID_CARD_INJECT_TOOL("mid_card_inject_tool"),
    MIFU_USE_AUDIO("mifu_use_audio"),
    FEED_CONTEXTUAL_KEYWORD("feed_contextual_keyword"),
    INTEREST_PIVOT_CHAIN("feed_interest_pivot_chain"),
    ACHIEVEMENTS_EARNED("achievements_earned"),
    FEED_CONTEXTUAL_ACCOUNT_HCM("feed_contextual_account_hcm"),
    TEXT_PAGE("text_page"),
    COMMENT_SHARE("comment_share"),
    BOOST("boost"),
    CLIPS_OVERLAY_ADS("clips_overlay_ads"),
    OPAL_USER_PROFILE("opal_feed_contextual_profile"),
    OPAL_USER_SELF_PROFILE("opal_feed_contextual_self_profile"),
    CLIPS_NEARBY_PUSH("clips_nearby_push"),
    CLIPS_HSCROLL("clips_hscroll"),
    FEED_CONTEXTUAL_CHAIN_SEED_AD("feed_contextual_chain_seed_ad"),
    CLIPS_REVIEW_TRANSLATED_DUBS("review_translated_dubs"),
    SPOTLIGHT("spotlight"),
    ORIGINALITY_INFO_LABEL("originality_info_label"),
    REVIEW_FOLLOWING_SCREEN("review_following_screen"),
    CREATOR_VIEWER_INSIGHT_MORE_SIMILAR_POPULAR_REELS("popular_with_your_followers"),
    IMMERSIVE_CATCH_UP("immersive_catch_up"),
    EDUCATION_HUB("education_hub"),
    CREATOR_DIGEST("creator_digest"),
    CREATOR_INSPIRATION_SIGNALS_PLAYGROUND("creator_inspiration_signals_playground"),
    UNKNOWN(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        ClipsViewerSource[] clipsViewerSourceArr;
        A01 = 0oU.A00(clipsViewerSourceArr);
        CREATOR = new C376419Hx(65);
    }

    public final boolean A00() {
        if (this == DIRECT_AD_FEED_OF_ADS || this == EXPLORE_GRID_AD_FEED_OF_ADS || this == CLIPS_MULTI_ADS_FEED_OF_ADS || this == CLIPS_PAE_MULTI_ADS_FEED_OF_ADS || this == FEED_TIMELINE_FEED_OF_ADS || this == FEED_MULTI_ADS_AD_CHAIN || this == FEED_PAE_MULTI_ADS_AD_CHAIN || this == FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE || this == FEED_SA_MULTI_ADS_WATCH_AND_BROWSE) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this == EXPLORE_POPULAR_MAJOR_UNIT || this == EXPLORE_POPULAR_MINOR_UNIT || this == EXPLORE_POPULAR_DEFAULT_UNIT || this == EXPLORE_TRENDING_MINOR_UNIT || this == EXPLORE_NEARBY_MINOR_UNIT || this == EXPLORE_INTEREST_MINOR_UNIT || this == EXPLORE_INTEREST_DEFAULT_UNIT || this == EXPLORE_POPULAR_AGGREGATE_TREND_MINOR_UNIT || this == EXPLORE_VYML || this == EXPLORE_VIDEO_CHAINING || this == EXPLORE_TILE_TWO_BY_TWO) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (this == PROFILE || this == GROUP_PROFILE || this == FEED_CONTEXTUAL_PROFILE || this == FEED_CONTEXTUAL_GROUP_PROFILE || this == FEED_CONTEXTUAL_SELF_PROFILE || this == SELF_PROFILE || this == FEED_CONTEXTUAL_FAN_CLUB || this == FEED_CONTEXTUAL_SELF_FAN_CLUB || this == OPAL_USER_SELF_PROFILE || this == OPAL_USER_PROFILE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    ClipsViewerSource(String str) {
        this.A00 = str;
        if (A02() && this != FEED_TIMELINE && this != FEED_CONTEXTUAL_PROFILE && this != FEED_CONTEXTUAL_GROUP_PROFILE && this != FEED_CONTEXTUAL_SELF_PROFILE && this != FEED_CONTEXTUAL_FAN_CLUB && this != FEED_CONTEXTUAL_SELF_FAN_CLUB && this != FEED_TIMELINE_EXPLORE_STORY && this != FEED_TIMELINE_MIXED_UNCONNECTED && this != FEED_CONTEXTUAL_CHAIN) {
            ClipsViewerSource clipsViewerSource = FEED_TIMELINE_FOLLOWING;
        }
    }
}
