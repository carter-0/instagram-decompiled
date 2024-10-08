package com.instagram.user.recommended;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C46443Df5;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class FollowListData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(94);
    public final C46443Df5 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public FollowListData(C46443Df5 df5, String str, String str2, String str3, boolean z) {
        this.A00 = df5;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
    }
}
