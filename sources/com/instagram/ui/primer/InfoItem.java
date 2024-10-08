package com.instagram.ui.primer;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class InfoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(80);
    public final IconConfig A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
    }

    public InfoItem(IconConfig iconConfig, Integer num, String str, String str2) {
        AnonymousClass7TG.A1O(str, iconConfig);
        this.A02 = str;
        this.A00 = iconConfig;
        this.A03 = str2;
        this.A01 = num;
    }
}
