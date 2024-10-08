package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryPromptPrefType implements Parcelable {
    UNRECOGNIZED("StoryPromptPrefType_unspecified"),
    NOT_APPLICABLE("0"),
    ON(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryPromptPrefType[] storyPromptPrefTypeArr;
        A02 = 0oU.A00(storyPromptPrefTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StoryPromptPrefType storyPromptPrefType : values()) {
            A0x.put(storyPromptPrefType.A00, storyPromptPrefType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(1);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryPromptPrefType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
