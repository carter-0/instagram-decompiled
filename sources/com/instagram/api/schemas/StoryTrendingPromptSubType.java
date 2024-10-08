package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryTrendingPromptSubType implements Parcelable {
    UNRECOGNIZED("StoryTrendingPromptSubType_unspecified"),
    CONNECTED_AND_CURATED_TRENDING("connected_and_curated_trending");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryTrendingPromptSubType[] storyTrendingPromptSubTypeArr;
        A02 = 0oU.A00(storyTrendingPromptSubTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StoryTrendingPromptSubType storyTrendingPromptSubType : values()) {
            A0x.put(storyTrendingPromptSubType.A00, storyTrendingPromptSubType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(12);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryTrendingPromptSubType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
