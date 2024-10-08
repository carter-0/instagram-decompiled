package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryPromptType implements Parcelable {
    UNRECOGNIZED("StoryPromptType_unspecified"),
    BEFORE_AND_AFTER("2"),
    DEFAULT("0"),
    ELECTION("8"),
    IMAGINE("12"),
    IMAGINE_ME("13"),
    MAGIC_MOD_ADD_YOURS_WITH_BACKDROP("10"),
    MAGIC_MOD_BACKDROP("7"),
    MAGIC_MOD_BRUSH("6"),
    MAGIC_MOD_RESTYLE("5"),
    MUSIC_PICK("9"),
    POTATO("11"),
    SPEAKEASY(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    STORY_TEMPLATE("4"),
    TOP_THREE("3");
    
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
        StoryPromptType[] storyPromptTypeArr;
        A02 = 0oU.A00(storyPromptTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (StoryPromptType storyPromptType : values()) {
            linkedHashMap.put(storyPromptType.A00, storyPromptType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(34);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryPromptType(String str) {
        this.A00 = str;
    }
}
