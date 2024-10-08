package com.instagram.igtv.persistence.draft;

import X.JTS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.util.List;

public final class IGTVBrandedContentTags implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(75);
    public BrandedContentProjectMetadata A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JTS.A0v(parcel);
    }
}
