package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AFI_TYPE implements Parcelable {
    UNRECOGNIZED("AFI_TYPE_unspecified"),
    DWELL_FEED_REPETITION("dwell_feed_repetition"),
    DWELL_FEED_SEE_MORE_LESS("dwell_feed_see_more_less"),
    DWELL_REELS_SEE_MORE_LESS("dwell_reels_see_more_less"),
    DWELL_STORY_SEE_MORE_LESS("dwell_story_see_more_less"),
    FEED_INTERESTS_PICKER("feed_interests_picker"),
    PERSISTENT_FEED_SEE_MORE_LESS("persistent_feed_see_more_less"),
    PERSISTENT_REELS_SEE_MORE_LESS("persistent_reels_see_more_less"),
    PERSISTENT_SEE_MORE_LESS("persistent_see_more_less"),
    PERSISTENT_STORY_SEE_MORE_LESS("persistent_story_see_more_less"),
    SEE_MORE_LESS("see_more_less"),
    UFI_REELS_SEE_MORE_LESS("ufi_reels_see_more_less");
    
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
        AFI_TYPE[] afi_typeArr;
        A02 = 0oU.A00(afi_typeArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AFI_TYPE afi_type : values()) {
            linkedHashMap.put(afi_type.A00, afi_type);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(46);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AFI_TYPE(String str) {
        this.A00 = str;
    }
}
