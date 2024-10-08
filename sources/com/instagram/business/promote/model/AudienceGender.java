package com.instagram.business.promote.model;

import X.0oU;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public enum AudienceGender implements Parcelable {
    MALE("MALE"),
    FEMALE("FEMALE");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        AudienceGender[] audienceGenderArr;
        A01 = 0oU.A00(audienceGenderArr);
        CREATOR = new W6D(15);
    }

    /* access modifiers changed from: public */
    AudienceGender(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
