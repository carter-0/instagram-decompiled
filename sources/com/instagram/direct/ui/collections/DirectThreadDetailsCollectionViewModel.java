package com.instagram.direct.ui.collections;

import X.0qQ;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.save.model.SavedCollection;

public final class DirectThreadDetailsCollectionViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(14);
    public final SavedCollection A00;
    public final Integer A01;

    public DirectThreadDetailsCollectionViewModel(SavedCollection savedCollection, Integer num) {
        0qQ.A0B(num, 1);
        this.A01 = num;
        this.A00 = savedCollection;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        if (this.A01.intValue() != 0) {
            str = "LOAD_MORE";
        } else {
            str = "COLLECTION_ITEM";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A00, i);
    }
}
