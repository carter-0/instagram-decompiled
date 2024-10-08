package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGPostTriggerExperience implements Parcelable {
    UNRECOGNIZED("IGPostTriggerExperience_unspecified"),
    IG_POST_TRIGGER_EXPERIENCE_CONTEXTUAL_REELS_PILL("6"),
    IG_POST_TRIGGER_EXPERIENCE_EXPLORE_GRID_AD_ELIGIBLE_FOR_B2B_ADS("9"),
    IG_POST_TRIGGER_EXPERIENCE_FEED_POST_AD_ENGAGEMENT_GAP_0("4"),
    IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN("5"),
    IG_POST_TRIGGER_EXPERIENCE_FEED_VIDEO_AD_TO_REELS_CHAIN_FOR_B2B_ELIGIBLE_ADS("7"),
    IG_POST_TRIGGER_EXPERIENCE_REELS_POST_AD_ENGAGEMENT_GAP_0("8"),
    IG_POST_TRIGGER_EXPERIENCE_STORIES_CONTEXTUAL_AD_NEXT_AD_SLOT(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    IG_POST_TRIGGER_EXPERIENCE_STORIES_MULTI_ADVERTISER_CAROUSEL("3");
    
    public static final Map A01 = null;
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
        int i;
        IGPostTriggerExperience[] iGPostTriggerExperienceArr;
        A02 = 0oU.A00(iGPostTriggerExperienceArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGPostTriggerExperience iGPostTriggerExperience : values()) {
            linkedHashMap.put(iGPostTriggerExperience.A00, iGPostTriggerExperience);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(38);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGPostTriggerExperience(String str) {
        this.A00 = str;
    }
}
