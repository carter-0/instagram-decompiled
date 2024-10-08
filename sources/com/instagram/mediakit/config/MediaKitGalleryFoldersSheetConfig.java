package com.instagram.mediakit.config;

import X.0qQ;
import X.C41847B3o;
import X.C41848B3p;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class MediaKitGalleryFoldersSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(14);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public MediaKitGalleryFoldersSheetConfig(List list) {
        this.A00 = list;
    }
}
