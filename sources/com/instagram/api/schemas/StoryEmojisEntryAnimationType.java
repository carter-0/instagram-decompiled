package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryEmojisEntryAnimationType implements Parcelable {
    UNRECOGNIZED("StoryEmojisEntryAnimationType_unspecified"),
    ANIMATE_WITH_EMOJI_POP_IN(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryEmojisEntryAnimationType[] storyEmojisEntryAnimationTypeArr;
        A02 = 0oU.A00(storyEmojisEntryAnimationTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (StoryEmojisEntryAnimationType storyEmojisEntryAnimationType : values()) {
            linkedHashMap.put(storyEmojisEntryAnimationType.A00, storyEmojisEntryAnimationType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(92);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryEmojisEntryAnimationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
