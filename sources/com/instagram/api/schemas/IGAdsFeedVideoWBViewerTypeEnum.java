package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGAdsFeedVideoWBViewerTypeEnum implements Parcelable {
    UNRECOGNIZED("IGAdsFeedVideoWBViewerTypeEnum_unspecified"),
    NO_POST_TAP_VIEWER("NO_POST_TAP_VIEWER"),
    POST_TAP_REELS_VIEWER("POST_TAP_REELS_VIEWER"),
    POST_TAP_REELS_VIEWER_WITH_CHAINING("POST_TAP_REELS_VIEWER_WITH_CHAINING"),
    POST_TAP_WATCH_AND_BROWSE_VIEWER("POST_TAP_WATCH_AND_BROWSE_VIEWER"),
    POST_TAP_WATCH_AND_BROWSE_VIEWER_FOR_LEAD_ADS("POST_TAP_WATCH_AND_BROWSE_VIEWER_FOR_LEAD_ADS"),
    POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER("POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER"),
    POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING("POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING");
    
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
        IGAdsFeedVideoWBViewerTypeEnum[] iGAdsFeedVideoWBViewerTypeEnumArr;
        A02 = 0oU.A00(iGAdsFeedVideoWBViewerTypeEnumArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum : values()) {
            linkedHashMap.put(iGAdsFeedVideoWBViewerTypeEnum.A00, iGAdsFeedVideoWBViewerTypeEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(21);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsFeedVideoWBViewerTypeEnum(String str) {
        this.A00 = str;
    }
}
