package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass05K;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class ItemDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(46);
    public String A00;
    public final Integer A01;

    public ItemDetails(Integer num, String str) {
        0qQ.A0B(num, 1);
        this.A01 = num;
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        if (this.A01.intValue() != 0) {
            str = "RESELLER";
        } else {
            str = "DEFAULT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A00);
    }

    public ItemDetails() {
        this(AnonymousClass05K.A00, (String) null);
    }
}
