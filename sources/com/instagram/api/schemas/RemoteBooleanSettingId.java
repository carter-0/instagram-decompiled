package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RemoteBooleanSettingId implements Parcelable {
    UNRECOGNIZED("RemoteBooleanSettingId_unspecified"),
    ACCOUNT_PRIVACY_SETTING("account_privacy_setting"),
    ALLOW_NOTES_ON_POSTS_AND_REELS("allow_notes_on_posts_and_reels"),
    ALLOW_PEOPLE_TO_DOWNLOAD_YOUR_REELS("allow_people_to_download_your_reels"),
    ALLOW_POST_AND_REEL_SHARING_TO_STORIES("allow_post_and_reel_sharing_to_stories"),
    ALLOW_POSTS_TO_BE_VISIBLE_IN_COLLECTIONS_SHARED_WITH_OTHERS("allow_posts_to_be_visible_in_collections_shared_with_others"),
    ALLOW_PROFILE_PICTURE_EXPANSION("allow_profile_picture_expansion"),
    ALLOW_REQUESTS_TO_FEATURE_YOUR_POSTS_IN_SHOPS("allow_requests_to_feature_your_posts_in_shops"),
    ALLOW_REUSE_OF_FEED_VIDEOS("allow_reuse_of_feed_videos"),
    ALLOW_REUSE_OF_POSTS("allow_reuse_of_posts"),
    ALLOW_REUSE_OF_REELS("allow_reuse_of_reels"),
    ALLOW_STORY_SHARING_IN_MESSAGES("allow_story_sharing_in_messages"),
    ARCHIVING_SAVE_LIVE_TO_ARCHIVE("archiving_save_live_to_archive"),
    ARCHIVING_SAVE_STORY_TO_ARCHIVE("archiving_save_story_to_archive"),
    ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY("archiving_save_story_to_camera_gallery"),
    ARCHIVING_SAVE_STORY_TO_GALLERY("archiving_save_story_to_gallery"),
    CUSTOM_WORDS_HIDE_COMMENTS("custom_words_hide_comments"),
    CUSTOM_WORDS_HIDE_MESSAGE_REQUESTS("custom_words_hide_message_requests"),
    HIDDEN_WORDS_ADVANCED_COMMENT_FILTERING("hidden_words_advanced_comment_filtering"),
    HIDDEN_WORDS_GLOBAL_BLOCKLIST("hidden_words_global_blocklist"),
    HIDDEN_WORDS_HIDE_COMMENTS("hidden_words_hide_comments"),
    HIDDEN_WORDS_HIDE_MESSAGE_REQUESTS("hidden_words_hide_message_requests"),
    IS_SLEEP_MODE_ENABLED("is_sleep_mode_enabled"),
    MESSAGE_REACHABILITY_LINKED_PAGE_DIRECT_MESSAGE("message_reachability_linked_page_direct_message"),
    RECOMMEND_ON_FACEBOOK("recommend_on_facebook"),
    SEO_INDEXING_OPT_OUT("seo_indexing_opt_out"),
    SERVER_TEST_ONLY_DO_NOT_USE("server_test_only_do_not_use"),
    TAGS_MENTIONS_HOW_YOU_MANAGE_BOOSTS_RESHARE_MEDIA("tags_mentions_how_you_manage_boosts_reshare_media"),
    TAGS_MENTIONS_WHO_CAN_BOOST("tags_mentions_who_can_boost"),
    TAGS_MENTIONS_WHO_CAN_TAG_ON_OTHER_APPS("tags_mentions_who_can_tag_on_other_apps");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RemoteBooleanSettingId[] remoteBooleanSettingIdArr;
        A02 = 0oU.A00(remoteBooleanSettingIdArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (RemoteBooleanSettingId remoteBooleanSettingId : values()) {
            A0x.put(remoteBooleanSettingId.A00, remoteBooleanSettingId);
        }
        A01 = A0x;
        CREATOR = new DE6(67);
    }

    /* access modifiers changed from: public */
    RemoteBooleanSettingId(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
