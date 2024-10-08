package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum PromoteLaunchOrigin implements Parcelable {
    AB_TESTING_PICKER,
    HEC_APPEAL,
    AD_PREVIEW,
    FEED_LIST,
    CAMPAIGN_CONTROLS_BUDGET_DURATION,
    MEDIA_PICKER,
    CLIENT_SPEC_OVERRIDE;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PromoteLaunchOrigin[] promoteLaunchOriginArr;
        A00 = 0oU.A00(promoteLaunchOriginArr);
        CREATOR = new W6D(47);
    }

    public final String toString() {
        return name();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
