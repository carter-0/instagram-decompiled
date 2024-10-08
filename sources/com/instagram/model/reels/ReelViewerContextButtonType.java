package com.instagram.model.reels;

import X.0oU;
import X.0qQ;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public enum ReelViewerContextButtonType implements Parcelable {
    VIEW_DAY,
    VIEW_ON_MAP;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(name());
    }

    /* access modifiers changed from: public */
    static {
        ReelViewerContextButtonType[] reelViewerContextButtonTypeArr;
        A00 = 0oU.A00(reelViewerContextButtonTypeArr);
        CREATOR = new C71269Ogb(64);
    }
}
