package com.instagram.mediakit.ui.model;

import X.0qQ;
import X.C62320sa;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public final class MediaKitLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(21);
    public final int A00;
    public final C62320sa A01;

    public MediaKitLink(C62320sa r2, int i) {
        0qQ.A0B(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeSerializable((Serializable) this.A01);
    }
}
