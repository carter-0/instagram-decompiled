package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdsStoryInteractiveMediaGestureType implements Parcelable {
    UNRECOGNIZED("IGAdsStoryInteractiveMediaGestureType_unspecified"),
    TAP_AND_HOLD_TO_INTERACT("TAP_AND_HOLD_TO_INTERACT");
    
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
        IGAdsStoryInteractiveMediaGestureType[] iGAdsStoryInteractiveMediaGestureTypeArr;
        A02 = 0oU.A00(iGAdsStoryInteractiveMediaGestureTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType : values()) {
            linkedHashMap.put(iGAdsStoryInteractiveMediaGestureType.A00, iGAdsStoryInteractiveMediaGestureType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(25);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsStoryInteractiveMediaGestureType(String str) {
        this.A00 = str;
    }
}
