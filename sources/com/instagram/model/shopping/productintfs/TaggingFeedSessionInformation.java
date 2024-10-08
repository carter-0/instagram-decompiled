package com.instagram.model.shopping.productintfs;

import X.0qQ;
import X.AnonymousClass7TG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class TaggingFeedSessionInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(22);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public TaggingFeedSessionInformation(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
