package com.instagram.api.schemas;

import X.0oU;
import X.DE7;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum FanClubNextStepsRecommendationsType implements Parcelable {
    UNRECOGNIZED("FanClubNextStepsRecommendationsType_unspecified"),
    ACTIVE_OFFERS("active_offers"),
    BROADCAST_CHAT("broadcast_chat"),
    CONTENT_PREVIEW("content_preview"),
    CREATE_SUBSCRIBER_CHANNEL("create_subscriber_channel"),
    CUSTOMIZE_BENEFITS("customize_benefits"),
    POST_OR_REEL("post_or_reel"),
    PROMO_VIDEO("promo_video"),
    SCHEDULE_LIVE("schedule_live"),
    SUBSCRIBER_CHAT("subscriber_chat"),
    SUBSCRIBER_CHAT_STORY_STICKER("subscriber_chat_story_sticker"),
    SUBSCRIPTION_SHOUTOUT_STORY_STICKER("subscriber_shoutout_story_sticker"),
    SUBSCRIBER_SOCIAL_CHANNEL("subscriber_social_channel"),
    SUBSCRIBER_STORY("subscriber_story"),
    SUBSCRIPTION_PROMO_STICKER("subscription_promo_sticker"),
    SUBSCRIPTION_STORY_STICKER("subscription_story_sticker"),
    WELCOME_EXPERIENCE("welcome_experience"),
    WELCOME_VIDEO("welcome_video");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        FanClubNextStepsRecommendationsType[] fanClubNextStepsRecommendationsTypeArr;
        A02 = 0oU.A00(fanClubNextStepsRecommendationsTypeArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType : values()) {
            A0x.put(fanClubNextStepsRecommendationsType.A00, fanClubNextStepsRecommendationsType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FanClubNextStepsRecommendationsType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
