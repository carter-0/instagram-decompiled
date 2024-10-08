package com.facebookpay.form.fragment.model;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormDisplayEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(86);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public FormDisplayEvent(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
