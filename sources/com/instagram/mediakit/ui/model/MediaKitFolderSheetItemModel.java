package com.instagram.mediakit.ui.model;

import X.0qQ;
import X.0sP;
import X.C51974G9v;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;

public final class MediaKitFolderSheetItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(19);
    public final int A00;
    public final Medium A01;
    public final String A02;
    public final 0sP A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeSerializable(this.A03);
    }

    public MediaKitFolderSheetItemModel(Medium medium, String str, 0sP r3, int i) {
        C51974G9v.A1M(str, medium, r3);
        this.A00 = i;
        this.A02 = str;
        this.A01 = medium;
        this.A03 = r3;
    }
}
