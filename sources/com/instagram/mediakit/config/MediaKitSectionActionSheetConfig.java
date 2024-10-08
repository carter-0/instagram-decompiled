package com.instagram.mediakit.config;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class MediaKitSectionActionSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(16);
    public final List A00 = AnonymousClass7TE.A1C();
    public final String A01;

    public MediaKitSectionActionSheetConfig(String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
    }
}
