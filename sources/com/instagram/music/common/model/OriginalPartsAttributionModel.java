package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class OriginalPartsAttributionModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(55);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public OriginalPartsAttributionModel(ImageUrl imageUrl, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = imageUrl;
    }
}
