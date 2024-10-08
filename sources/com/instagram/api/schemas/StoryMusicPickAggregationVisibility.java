package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryMusicPickAggregationVisibility implements Parcelable {
    UNRECOGNIZED("StoryMusicPickAggregationVisibility_unspecified"),
    VISIBLE("0"),
    HIDDEN(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryMusicPickAggregationVisibility[] storyMusicPickAggregationVisibilityArr;
        A02 = 0oU.A00(storyMusicPickAggregationVisibilityArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility : values()) {
            A0x.put(storyMusicPickAggregationVisibility.A00, storyMusicPickAggregationVisibility);
        }
        A01 = A0x;
        CREATOR = new DE6(96);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryMusicPickAggregationVisibility(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
