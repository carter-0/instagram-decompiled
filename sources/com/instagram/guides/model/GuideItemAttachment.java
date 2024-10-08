package com.instagram.guides.model;

import X.0qQ;
import X.C16511UwC;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.simpleplace.SimplePlace;
import com.instagram.user.model.User;

public final class GuideItemAttachment implements Parcelable {
    public static final W6E CREATOR = new W6E(68);
    public C16511UwC A00;
    public ProductContainer A01 = null;
    public SimplePlace A02 = null;
    public User A03 = null;

    public GuideItemAttachment() {
        C16511UwC uwC = C16511UwC.UNKNOWN;
        this.A00 = uwC;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeSerializable(this.A00);
    }
}
