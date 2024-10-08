package com.instagram.follow.autofollowback;

import X.0qQ;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class AutoFollowBackBottomSheetData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(52);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public AutoFollowBackBottomSheetData(ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass7TG.A1P(str, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }
}
