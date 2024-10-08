package com.instagram.model.reels;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryWedgingType implements Parcelable {
    UNRECOGNIZED("StoryWedgingType_unspecified"),
    OFF("off"),
    SHOW_ALL("show_all"),
    SHOW_ALL_REINSERT("show_all_reinsert");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryWedgingType[] storyWedgingTypeArr;
        A02 = 0oU.A00(storyWedgingTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StoryWedgingType storyWedgingType : values()) {
            A0x.put(storyWedgingType.A00, storyWedgingType);
        }
        A01 = A0x;
        CREATOR = C71269Ogb.A00(65);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryWedgingType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
