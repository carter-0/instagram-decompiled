package com.instagram.creation.sharesheet.rowitems.model;

import X.0oU;
import X.Dbb;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public enum PublishScreenCategoryType implements Parcelable {
    MAIN,
    AUDIENCE_AND_DISTRIBUTION,
    ADS_AND_MONETIZATION,
    MORE,
    INTERNAL_TEST,
    CROSSPOST;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PublishScreenCategoryType[] publishScreenCategoryTypeArr;
        A00 = 0oU.A00(publishScreenCategoryTypeArr);
        CREATOR = LVP.A00(48);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
