package com.instagram.avatar;

import X.0qQ;
import X.C41847B3o;
import X.FK6;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class AddAvatarHelper$LoadedImage$LoadedImageMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK6.A00(82);
    public final int A00;
    public final Uri A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (Uri) C41847B3o.A03(parcel, Uri.class);
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Uri uri, int i) {
        this.A00 = i;
        this.A01 = uri;
    }
}
