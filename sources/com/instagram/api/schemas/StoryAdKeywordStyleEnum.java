package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryAdKeywordStyleEnum implements Parcelable {
    UNRECOGNIZED("StoryAdKeywordStyleEnum_unspecified"),
    COLOR_CHANGE("COLOR_CHANGE"),
    BACKGROUND_CHANGE("BACKGROUND_CHANGE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryAdKeywordStyleEnum[] storyAdKeywordStyleEnumArr;
        A02 = 0oU.A00(storyAdKeywordStyleEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (StoryAdKeywordStyleEnum storyAdKeywordStyleEnum : values()) {
            linkedHashMap.put(storyAdKeywordStyleEnum.A00, storyAdKeywordStyleEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(90);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryAdKeywordStyleEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
