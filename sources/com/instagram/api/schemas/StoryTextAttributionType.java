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

public enum StoryTextAttributionType implements Parcelable {
    UNRECOGNIZED("StoryTextAttributionType_unspecified"),
    MULTIPLE_LISTS("multiple_lists");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryTextAttributionType[] storyTextAttributionTypeArr;
        A02 = 0oU.A00(storyTextAttributionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StoryTextAttributionType storyTextAttributionType : values()) {
            A0x.put(storyTextAttributionType.A00, storyTextAttributionType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(9);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryTextAttributionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
