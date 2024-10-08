package com.instagram.mediakit.config;

import X.0qQ;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;

public final class MediaKitConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(13);
    public final MediaKitEntryPoint A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public MediaKitConfig(MediaKitEntryPoint mediaKitEntryPoint, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mediaKitEntryPoint;
    }
}
