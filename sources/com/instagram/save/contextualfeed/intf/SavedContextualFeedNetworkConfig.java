package com.instagram.save.contextualfeed.intf;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.save.model.SavedCollection;

public final class SavedContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(19);
    public final SavedCollection A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public SavedContextualFeedNetworkConfig(SavedCollection savedCollection, String str) {
        this.A00 = savedCollection;
        this.A01 = str;
    }
}
