package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PromoteUnavailableReason implements Parcelable {
    UNRECOGNIZED("PromoteUnavailableReason_unspecified"),
    AUDIENCE_TYPE_OPAL("audience_type_opal"),
    BRANDED_CONTENT_ASYNC_JOB_IN_PROGRESS("branded_content_async_job_in_progress"),
    BRANDED_CONTENT_BOOSTED_BY_PARTNER("branded_content_boosted_by_partner"),
    BUSINESS_TRANSACTION_ENABLED("business_transaction_enabled"),
    CAROUSEL_EDITED_BEFORE_REBOOST("carousel_edited_before_reboost"),
    CAROUSEL_HAS_MUSIC_WITH_COPYRIGHT("carousel_has_music_with_copyright"),
    CAROUSEL_HAS_TOO_MANY_ITEMS("carousel_has_too_many_items"),
    CAROUSEL_OR_IMAGE_ELIGIBLE_BY_MUSIC_SELECTION("carousel_or_image_eligible_by_music_selection"),
    CAROUSEL_OR_IMAGE_HAS_COPYRIGHT_MUSIC_ELIGIBLE_BY_REMOVING("carousel_or_image_has_copyright_music_eligible_by_removing"),
    CAROUSEL_OR_IMAGE_HAS_NON_COPYRIGHT_MUSIC_ELIGIBLE_BY_REMOVING("carousel_or_image_has_non_copyright_music_eligible_by_removing"),
    CAROUSEL_OR_IMAGE_WITH_ADS_ELIGIBLE_MUSIC("carousel_or_image_with_ads_eligible_music"),
    CLIPS_ASPECT_RATIO("clips_aspect_ratio"),
    CLIPS_BLOCKED("clips_blocked"),
    CLIPS_CAMERA_EFFECT("clips_camera_effect"),
    CLIPS_CREATION_TIME("clips_creation_time"),
    CLIPS_FIRST_PARTY_EFFECT("clips_first_party_effect"),
    CLIPS_GIF_STICKERS("clips_gif_stickers"),
    CLIPS_GIF_STICKERS_ELIGIBLE("clips_gif_stickers_eligible"),
    CLIPS_HAS_MUSIC_WITH_COPYRIGHT("clips_has_music_with_copyright"),
    CLIPS_INTERACTIVE_ELEMENTS("clips_interactive_elements"),
    CLIPS_IS_TRIAL("clips_is_trial"),
    CLIPS_SHARED_TO_FB_BLOCKED("clips_shared_to_fb_blocked"),
    CLIPS_VIDEO_DURATION("clips_video_duration"),
    CLIPS_WITH_PRODUCT_TAG("clips_with_product_tag"),
    HAS_BRANDED_CONTENT_TAG("has_branded_content_tag"),
    HAS_FEATURED_PRODUCT("has_featured_product"),
    HAS_FUNDRAISER_TAG("has_fundraiser_tag"),
    HAS_MISINFORMATION("has_misinformation"),
    HAS_NEWSWORTHY_CONTENT("has_newsworthy_content"),
    HAS_ORGANIC_PRODUCT_TAGS("has_organic_product_tags"),
    HAS_PAST_PROMOTION("has_past_promotion"),
    HAS_PENDING_BRANDED_CONTENT_TAG("has_pending_branded_content_tag"),
    HAS_PINNED_PRODUCT_TAGS("has_pinned_product_tags"),
    HAS_TAGGED_COLLECTION("has_tagged_collection"),
    HAS_UNPROMOTABLE_AUDIENCE_CONTROL("has_unpromotable_audience_control"),
    HAS_UNSUPPORTED_NUMBER_OF_BRANDED_CONTENT_SPONSORS("has_unsupported_number_of_branded_content_sponsors"),
    HAS_UPCOMING_EVENT_INFO("has_upcoming_event_info"),
    INTERNAL_UNKNOWN_ERROR("internal_unknown_error"),
    INVALID_NINE_BY_SIXTEEN("invalid_nine_by_sixteen"),
    INVALID_VIDEO_DURATION("invalid_video_duration"),
    IS_AD_MEDIA("is_ad_media"),
    IS_ARCHIVED_POST("is_archived_post"),
    IS_CLIPS("is_clips"),
    IS_CLIPS_PANAVIDEO("is_clips_panavideo"),
    IS_DIRECT("is_direct"),
    IS_GROUPS_POST("is_groups_post"),
    IS_PRIVATE_ACCOUNT("is_private_account"),
    IS_PROFILE_MEDIA("is_profile_media"),
    IS_SIDECAR_CHILD("is_sidecar_child"),
    LOW_RESOLUTION_PHOTO("low_resolution_photo"),
    LOW_RESOLUTION_VIDEO("low_resolution_video"),
    LOW_RESOLUTION_VIDEO_ELIGIBLE_FOR_SR("low_resolution_video_eligible_for_sr"),
    NO_PROFILE_PICTURE("no_profile_picture"),
    POST_HAS_MUSIC_WITH_COPYRIGHT("post_has_music_with_copyright"),
    SANCTIONED_USER("sanctioned_user"),
    SHARED_WITH_FAVORITES_ONLY("shared_with_favorites_only"),
    SPONSOR_NO_PERMISSION_TO_BOOST_BRANDED_CONTENT("sponsor_no_permission_to_boost_branded_content"),
    STORY_ASPECT_RATIO("story_aspect_ratio"),
    STORY_BLOCKED("story_blocked"),
    STORY_CAMERA_EFFECT("story_camera_effect"),
    STORY_CREATION_TIME("story_creation_time"),
    STORY_GIF_STICKERS_ELIGIBLE("story_gif_stickers_eligible"),
    STORY_HAS_MUSIC_WITH_COPYRIGHT("story_has_music_with_copyright"),
    STORY_INTERACTIVE_GENERIC("story_interactive_generic"),
    STORY_INTERACTIVE_INVALID_ELEMENT_POSITION("story_interactive_invalid_element_position"),
    STORY_INTERACTIVE_INVALID_ELEMENT_TYPE("story_interactive_invalid_element_type"),
    STORY_INTERACTIVE_INVALID_FEED_MEDIA("story_interactive_invalid_feed_media"),
    STORY_INTERACTIVE_INVALID_LINK("story_interactive_invalid_link"),
    STORY_INTERACTIVE_INVALID_LOCATION_HASHTAG_COUNTDOWN("story_interactive_invalid_location_hashtag_countdown"),
    STORY_INTERACTIVE_INVALID_MENTION("story_interactive_invalid_mention"),
    STORY_INTERACTIVE_INVALID_MENTION_ELIGIBLE_FOR_SINGLE_STORY_MENTION("story_interactive_invalid_mention_eligible_for_single_story_mention"),
    STORY_INTERACTIVE_INVALID_POLL("story_interactive_invalid_poll"),
    STORY_INTERACTIVE_INVALID_PRODUCT_ITEM("story_interactive_invalid_product_item"),
    STORY_INTERACTIVE_INVALID_SELLER_COLLECTION("story_interactive_invalid_seller_collection"),
    STORY_INTERACTIVE_MULTIPLE_ELEMENTS("story_interactive_multiple_elements"),
    STORY_INTERACTIVE_MULTIPLE_ELEMENTS_ELIGIBLE("story_interactive_multiple_elements_eligible"),
    STORY_INTERACTIVE_MULTIPLE_ELEMENTS_ELIGIBLE_FOR_MULTIPLE_STORY_MENTION("story_interactive_multiple_elements_eligible_for_multiple_story_mention"),
    STORY_INTERACTIVE_RESHARED_FEED_MEDIA_ELIGIBLE("story_interactive_reshared_feed_media_eligible"),
    STORY_STATIC_STICKERS("story_static_stickers"),
    TOO_MANY_HASHTAGS("too_many_hashtags"),
    UNAVAILABLE_GENERIC("unavailable_generic"),
    USER_NO_PERMISSION_TO_BOOST_MEDIA("user_no_permission_to_boost_media"),
    USER_NOT_OWNER("user_not_owner");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PromoteUnavailableReason[] promoteUnavailableReasonArr;
        A02 = 0oU.A00(promoteUnavailableReasonArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (PromoteUnavailableReason promoteUnavailableReason : values()) {
            linkedHashMap.put(promoteUnavailableReason.A00, promoteUnavailableReason);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PromoteUnavailableReason(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
