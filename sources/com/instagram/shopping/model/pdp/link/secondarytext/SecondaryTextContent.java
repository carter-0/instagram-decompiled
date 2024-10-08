package com.instagram.shopping.model.pdp.link.secondarytext;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SecondaryTextContent implements Parcelable {
    public static final W6F CREATOR = new W6F(53);
    public String A00 = "";
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }
}
