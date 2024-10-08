package com.instagram.model.keyword;

import X.0qQ;
import X.0sn;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class KeywordRecommendations implements Parcelable {
    public static final C71269Ogb CREATOR = new C71269Ogb(58);
    public String A00 = "";
    public String A01 = "";
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeTypedList(this.A02);
    }

    public KeywordRecommendations() {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 3);
        this.A02 = r1;
    }
}
