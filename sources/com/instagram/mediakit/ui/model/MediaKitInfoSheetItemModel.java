package com.instagram.mediakit.ui.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaKitInfoSheetItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(20);
    public Object[] A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public MediaKitInfoSheetItemModel(Integer num, Integer num2, Integer num3) {
        this.A03 = num;
        this.A01 = num2;
        this.A02 = num3;
        this.A00 = new Object[0];
    }

    public MediaKitInfoSheetItemModel() {
        this((Integer) null, (Integer) null, (Integer) null);
    }
}
